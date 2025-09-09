/*
	Problem Statement: Second Highest Occurring Element
	File Name: 03SecondHighestOccurring.java
*/

import java.util.Map;
import java.util.HashMap;

class SecondHighestOccurring {
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
		int secondmax = Integer.MIN_VALUE;
		
		int maxKey = 0;
		int secondmaxKey = 0;
		for(Integer key : freq.keySet()) {
			if(max < freq.get(key)) {
			    maxKey = key;
				max = freq.get(key);
			}
		}
		for(Integer key : freq.keySet()) {
			if(freq.get(key) > secondmax && freq.get(key) < max) {
			    secondmaxKey = key;
				secondmax = freq.get(key);
			}
		}
		System.out.println(maxKey+"-max: "+max);
		System.out.println(secondmaxKey+"-secondmax: "+secondmax);
	}
}
