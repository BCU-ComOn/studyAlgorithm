package week4.팀2;

import java.util.Scanner;

public class bj1085_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[4];
		int min = 1000;
		int min2 = 0;
		for (int i = 0; i < 4; i++) {
			num[i] = sc.nextInt();
			if (i < 2) {
				if (min > num[i])
					min = num[i];
			}
		}
		if (num[2] - num[0] > num[3] - num[1])
			min2 = num[3] - num[1];
		else
			min2 = num[2] - num[0];
		if (min2 > min)
			System.out.println(min);
		else
			System.out.println(min2);
	}

}