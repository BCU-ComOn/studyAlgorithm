package week3.팀2;

import java.util.Scanner;

public class bj2444_cbj {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int z = 1; z <= n - i; z++) { // 별쓰기전 띄어쓰기
				System.out.print(" ");
			}
			for (int y = 1; y <= i + i - 1; y++) { // 별 찍기
				System.out.print("*");
			}
			System.out.println(); // 별쓰고 줄바꿈
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int z = 1; z <= n - i; z++) { // 별쓰기전 띄어쓰기
				System.out.print(" ");
			}
			for (int y = 1; y <= i + i - 1; y++) { // 별 찍기
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
