package week3.팀1;

import java.util.Scanner;
public class BJ2444_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
        //별찍기는 주석 달아도 타인이 이해하기 힘들다.
		
		for(int i = 1; i < (2 * cnt); i += 2) {
			for(int j = 0; j < ((2 * cnt - i - 1) / 2); j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < cnt - 1; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2 * (cnt - i - 1) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}