package week3.팀1;

import java.util.Scanner;

public class BJ2444_ayj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=n-i-1; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=n-1; k<n+i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n+1; i<2*n; i++) {
			for(int k=0; k<i-n; k++) {
				System.out.print(" ");
			}
			for(int j=2*n-i*2+n*2-1; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}