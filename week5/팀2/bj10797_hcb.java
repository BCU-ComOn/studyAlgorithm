package week5.팀2;

import java.util.Scanner;

public class bj10797_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int count = 0;
		int day = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			if (num[i] == day)
				count++;
		}
		System.out.println(count);
	}

}