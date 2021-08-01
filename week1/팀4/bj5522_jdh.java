package week1.팀4;

import java.util.Scanner;

public class bj5522_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = 0;

		for (int i = 0; i < 5; i++) {
			int num = in.nextInt();
			if (num >= 0 && num <= 100)
				total += num;
		}
		System.out.println(total);
	}

}
