package week5.팀4;

import java.util.Scanner;

public class bj16486_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int d1 = in.nextInt();
		double d2 = in.nextDouble();
		
		in.close();
		
		System.out.printf("%6f", (d1 * 2) + (d2 * 2 * 3.141592));
	}

}
