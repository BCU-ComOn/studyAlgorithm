package week1.팀2;

import java.util.Scanner;

public class bk10156_gkahsl13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] = new int[3];

		for (int i = 0; i < 3; i++) {
			a[i] = in.nextInt();
		}
		a[2] = a[0] * a[1] - a[2];

		if (a[2] < 0) {
			a[2] = 0;
		}
		System.out.println(a[2]);
	}
}
