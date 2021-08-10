package week3.팀4;

import java.util.Scanner;

public class bj3004_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int result;
		
		if (N % 2 == 0) {
			result = ((N + 2) / 2) * ((N + 2) / 2);
		}
		else {
			result = ((N + 3) / 2) * ((N + 3) / 2) - ((N + 3) / 2);
		}
		
		System.out.println(result);
	}

}
