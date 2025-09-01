/*
	Problem Statement: Highest Occurring Element in an Array
	File Name: 01HighestOccurring.java
*/
import java.util.Map;
import java.util.HashMap;

class HighestOccurring {
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
		int[] arr = {1,2,4,1,3,2,4,1};
		Map<Integer, Integer> freq = frequence(arr);
		System.out.println(freq);
		int max = Integer.MIN_VALUE;
		for(Integer key : freq.keySet()) {
			if(max < freq.get(key)) {
				max = freq.get(key);
			}
		}
		System.out.print(max);
	}
}