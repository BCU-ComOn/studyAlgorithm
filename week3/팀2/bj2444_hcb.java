package week3.팀2;

import java.util.Scanner;

public class bj2444_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int a = 1; a <= n - i; a++) {
				System.out.print(" ");
			}
			for (int a = 1; a <= 2 * i - 1; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int a = 1; a <= n - i; a++) {
				System.out.print(" ");
			}
			for (int a = 1; a <= 2 * i - 1; a++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}