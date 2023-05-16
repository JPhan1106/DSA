package dataStructure;

import java.util.ArrayList;

public class SquareNumber {
	public static void main(String[] args) {
		int a = 3;
		int b = 9;
		int solution = solution(a, b);
		System.out.println(solution);

	}

	public static int solution(int a, int b) {
		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = a; i <= b; i++) {
			list.add(i);
		}
		for (Integer num : list) {
			double squareRoot = Math.sqrt(num);
			if ((int) squareRoot * (int) squareRoot == num) {
				count++;

			}
		}
		return count;
	}

}
