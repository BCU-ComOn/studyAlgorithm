package week4.팀2;

import java.util.Scanner;

public class bj11948_cbj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] = new int[6];
		for (int i = 0; i < 6; i++) {
			a[i] = in.nextInt();
		}
		int min = a[0];
		for (int z = 1; z < 4; z++) {
			if (min > a[z]) {
				min = a[z];
			}
		}

		if (a[4] >= a[5]) {
			a[5] = 0;
		} else if (a[4] < a[5]) {
			a[4] = 0;
		}

		int sum = a[0] + a[1] + a[2] + a[3] + a[4] + a[5] - min;
		System.out.println(sum);

	}

}
