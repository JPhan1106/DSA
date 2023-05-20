package dataStructure;

import java.util.HashMap;

public class SockMerchant {

	public static void main(String[] args) {
		int[] array = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("The number of pairs: " + sockMerchant(array));
	}

	public static int sockMerchant(int[] array) {
		HashMap<Integer, Integer> hashmap = new HashMap<>();


		for (int color : array) {
			hashmap.put(color, hashmap.getOrDefault(color, 0) + 1);
		}

		int count = 0;
		for (int value : hashmap.values()) {
			count += value / 2;
		}

		return count;
	}
}
