package week1.팀2;

import java.util.Scanner;

public class bk2475_gkahsl13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			num = in.nextInt();
			num = num * num;
			sum += num;
		}
		sum = sum % 10;
		System.out.println(sum);
	}

}
