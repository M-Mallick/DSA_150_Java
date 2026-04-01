/*
    [1,2,3] -> [], [1], [2], [3], [1,2], [1,3], [2,3]
*/
import java.util.*;
public class SubarrayI {
    public static void backtracking(List<List<Integer>> list, int[] arr, List<Integer> path, int i) {
        if(i == arr.length) {
            list.add(new ArrayList<>(path));
            return;
        }

        // add: arr[i] --> YES
        path.add(arr[i]);
        backtracking(list, arr, path, i+1);

        path.remove(path.size() - 1);
        
        // add: arr[i] --> NO
        backtracking(list, arr, path, i+1);
    }
    public static List<List<Integer>> sunarrayI(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        backtracking(list, arr, new ArrayList<>(), 0);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = sunarrayI(arr);
        System.out.println(list);
    }
}
