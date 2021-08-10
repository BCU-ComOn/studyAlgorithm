package week5.팀2;

import java.util.Scanner;

public class bj4101_cbj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a,b;
		while(true) {
			a=in.nextInt();
			b=in.nextInt();
			
			if(a==0 && b==0) break;
			
			if(a>b) System.out.println("Yes");
			else System.out.println("No");
			
			
			
		}
	}
}
