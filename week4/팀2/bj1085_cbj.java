package week4.팀2;

import java.util.Scanner;

public class bj1085_cbj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();

		int a[] = new int[4];
		a[0] = x;
		a[1] = y;
		a[2] = h - y;
		a[3] = w - x;

		int min = a[0];

		for (int i = 1; i < 4; i++) {
			if (a[i] < min)
				min = a[i];
		}
		System.out.println(min);

	}

}
