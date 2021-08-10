package week4.팀1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1085_ayj {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int x = ss.nextInt();
		int y = ss.nextInt();
		int w = ss.nextInt();
		int h = ss.nextInt();
		// 한수의 현위치(x,y) 직사각형 w=가로길이,h=세로길이
		int[] arr = new int[4];
		arr[0] = x;
		arr[1] = y;
		arr[2] = w - x;
		arr[3] = h - y;
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

}
