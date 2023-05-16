package dataStructure;

public class Candles {
	public static void main(String[] args) {
		int[] candles = { 4, 4, 1, 3 };
		System.out.println(solution(candles));
	}

	public static int solution(int[] arr) {
		int count = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max){
				max = arr[i];
				count = 1;
			}
			else if (arr[i] == max) {
				count++;
			}
		}
		return count;

	}

}
