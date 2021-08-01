package week3.팀1;

import java.util.Scanner;

public class bj2774_cbj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); // 몇개 입력받을건지
		int[] cnt = new int[t]; // 아름다운 갯수 파악 변수

		for (int i = 0; i < t; i++) {
			long X = in.nextLong(); // 입력 받는 수
			boolean[] arr = new boolean[10]; // 0부터 9까지 있으니까
			while (X != 0) {
				arr[(int) (X % 10L)] = true; // 입력받는수 나머지가 배열에 번호 거기다 1 입력
				X /= 10; // 숫자를 10 씩 계속 나누면서 뒤에서부터 하나씩 검사.
			}

			for (int j = 0; j < 10; j++) {
				if (arr[j] == true) {
					cnt[i] = cnt[i] + 1; // boolean 배열 확인하면서 1이 들어가있으면 갯수 늘리는식으로
				}
			}

		}
		for (int z = 0; z < t; z++) {
			System.out.println(cnt[z]);
		}

	}

}
