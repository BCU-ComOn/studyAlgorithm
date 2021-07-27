package week2.팀4;

import java.util.Scanner;

public class bj10179_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int count = in.nextInt();
		double price[] = new double[count];
		
		for (int i = 0; i < count; i++) price[i] = in.nextDouble();
		
		for (int i = 0; i < count; i++) {
			price[i] -= price[i] / 5.0;
			System.out.printf("$%.2f\n", price[i]);
		}
	}
	
}
