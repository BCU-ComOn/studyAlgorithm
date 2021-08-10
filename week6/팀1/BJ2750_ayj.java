package week6.팀1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ2750_ayj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		Arrays.sort(num);
		for (int i = 0; i < n; i++) {
			System.out.println(num[i]);
		}
	}

}
