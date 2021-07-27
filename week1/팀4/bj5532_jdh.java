package week1.팀4;

import java.util.Scanner;

public class bj5532_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int L = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		int count = 0;

		while (true) {
			A -= C;
			B -= D;
			count++;
			if (A <= 0 && B <= 0)
				break;
		}
		System.out.println(L - count);
	}

}
