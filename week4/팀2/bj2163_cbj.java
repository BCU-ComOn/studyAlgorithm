package week4.팀2;

import java.util.Scanner;

public class bj2163_cbj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();// 가로
		int b = in.nextInt();// 세로
		System.out.println((a - 1) + (b - 1) * a);
		// 가로를 1로 만들기위해 a-1 번 잘라야하고 세로에서도 b-1번자르고 a개 씩 있으므로

	}

}
