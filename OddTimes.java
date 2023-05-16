package dataStructure;

public class OddTimes {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };

		solution(arr);
	}

	public static void solution(Integer[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}

		int[] countArray = new int[max + 1];

		for (int number : arr) {
			countArray[number]++;
		}

		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}