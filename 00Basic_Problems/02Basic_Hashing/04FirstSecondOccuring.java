/*
	Problem Statement: Problem Statement: Display all array elements that have 
					   the highest frequency (maximum occurring elements) 
					   and the second highest frequency (second maximum occurring elements).

	File Name: 04FirstSecondOccuring.java
*/
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
	public  static Map<Integer, Integer> frequence(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			if(!map.containsKey(key)) {
				map.put(key,1);
			}else {
				map.put(key,map.get(key)+1);
			}
		}
		return map;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,4,1,3,2,4,1,3,3,5,7,5,6};
		Map<Integer, Integer> freq = frequence(arr);
		
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		
		ArrayList<Integer> maxlist = new ArrayList<>();
		for(Integer key : freq.keySet()) {
			if(max <= freq.get(key)) {
			    maxlist.add(key);
				max = freq.get(key);
			}
		}
		
		ArrayList<Integer> secondMaxlist = new ArrayList<>();
		for(Integer key : freq.keySet()) {
			if(freq.get(key) >= secondmax && freq.get(key) < max) {
			    secondMaxlist.add(key);
				secondmax = freq.get(key);
			}
		}
		System.out.println("Map: "+freq);
		System.out.println("\nMaximun Occurring List: "+maxlist);
		System.out.println("\nSecond Maximun Occurring List: "+secondMaxlist);
	}
}
