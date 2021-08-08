package week4.팀1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ11948_ayj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int[] arr2 = new int[2];
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);// 정렬해서 배열 맨앞으로 최소값오게함
		int min = arr[0];
		for (int i = 0; i < 4; i++) {
			sum += arr[i];
		}
		for (int i = 0; i < 2; i++) {
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr2);// 정렬해서 배열 맨앞으로 최소값오게함
		int min2 = arr2[0];
		for (int i = 0; i < 2; i++) {
			sum += arr2[i];
		}
		sum = sum - min - min2;
		System.out.println(sum);
		// 시험 점수의 합이 가장 높게 나오도록 과목을 선택
		// a~d 중 높은 점수 3개 뽑아서 더하기
		// e와f 중 높은 점수 하나 뽑아서 위에꺼랑 더하기

	}

}