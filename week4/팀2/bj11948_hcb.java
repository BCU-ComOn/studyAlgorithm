package week4.팀2;

import java.util.Scanner;

public class bj11948_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 100;
		int sum = 0;
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = sc.nextInt();
			if (i < 4) {
				if (max > num[i])
					max = num[i];
				sum += num[i];
			}

		}
		sum -= max;

		if (num[5] > num[4])
			max = num[5];
		else
			max = num[4];
		sum += max;
		System.out.printf("%d", sum);
	}

}