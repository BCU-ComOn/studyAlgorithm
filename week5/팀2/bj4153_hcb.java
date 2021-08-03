package week5.팀2;

import java.util.Scanner;

public class bj4153_hcb {

	public static void main(String[] args) {
		int num[] = new int[3];
		Scanner sc = new Scanner(System.in);
		while (true) {
			for (int i = 0; i < 3; i++) {
				num[i] = sc.nextInt();

			}

			if (num[0] == 0 && num[1] == 0 && num[2] == 0)
				break;
			if ((num[0] * num[0]) + (num[1] * num[1]) == num[2] * num[2])
				System.out.println("right");
			else if ((num[2] * num[2]) + (num[1] * num[1]) == num[0] * num[0])
				System.out.println("right");
			else if ((num[2] * num[2]) + (num[0] * num[0]) == num[1] * num[1])
				System.out.println("right");
			else
				System.out.println("wrong");

		}

	}

}