package week2.팀4;

import java.util.Scanner;

public class bj17614_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			int number = i + 1;
			String temp = String.valueOf(number);
			for (int k = 0; k < temp.length(); k++) {
				if (temp.charAt(k) == '3' || temp.charAt(k) == '6' || temp.charAt(k) == '9') count += 1;
			}
		}
		
		System.out.println(count);
	}
}
