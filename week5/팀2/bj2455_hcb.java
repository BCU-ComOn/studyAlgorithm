package week5.팀2;

import java.util.Scanner;

public class bj2455_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sta[][] = new int[4][2];
		int num[] = new int[4];
		int max = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				sta[i][j] = sc.nextInt();

			}
			if (i == 0)
				num[0] = sta[0][1];
			else
				num[i] = num[i - 1] - sta[i][0] + sta[i][1];
			if (num[i] > max)
				max = num[i];
		}
		System.out.println(max);

	}

}