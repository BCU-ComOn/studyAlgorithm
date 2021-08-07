package week5.팀1;

import java.util.Scanner;

public class BJ10797_ayj {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 일의 자리
		int num = sc.nextInt();// 날짜의 일의 자리 숫자
		int[] arr = new int[5];// 5대의 자동차 번호의 일의 자리 숫자
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == num) {
				sum += 1;
			}
		}
		System.out.println(sum);
	}
}
