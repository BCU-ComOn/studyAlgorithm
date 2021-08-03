package week4.팀4;

import java.util.Scanner;

public class bj11948_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int main_sj = 101;
		int main_r = 0;

		for (int i = 0; i < 4; i++) {
			int A = in.nextInt();
			if (A < main_sj)
				main_sj = A;
			main_r += A;
		}

		int E = in.nextInt();
		int F = in.nextInt();

		if (E > F)
			System.out.println(main_r - main_sj + E);
		else
			System.out.println(main_r - main_sj + F);
	}

}
