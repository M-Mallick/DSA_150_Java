/*
	Problem Statement: Highest Occurring Element in an Array
	File Name: 01Frequence.java
*/
import java.util.Map;
import java.util.HashMap;

class Frequence {
	public  static Map<Intgere, Intgere> frequence(int[] arr) {
		Map<Intgere, Intgere> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			map.put(key, map.getOrDefault(key, 0) + 1);
			/*
				map.getOrDefault(key, 0)

				This checks if the map already contains key.

				If yes, it returns the current value (the count so far).

				If no, it returns the default value 0.
			*/
		}
		return map;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,4,1,3,2,4,1};
		Map<Intgere, Intgere> freq = frequence(arr);
		for(Intgere key : freq.keySet()) {
			System.out.println(key+" : "+freq.get(key));
		}
	}
}
