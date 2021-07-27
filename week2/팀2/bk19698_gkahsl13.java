package week2.팀2;

import java.util.Scanner;
public class bk19698_gkahsl13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a =in.nextInt();
		int b =in.nextInt();
		int c =in.nextInt();
		int d =in.nextInt();
		
		b/=d;
		c/=d;
		
		System.out.println(Math.min(b*c,a));
	}
}
