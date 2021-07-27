package week2.팀1;

import java.util.Scanner;
public class BJ10179_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnum = s.nextInt();
		double[] sum = new double[cnum];
		
		for(int i=0; i<cnum; i++) {
			sum[i] = s.nextDouble();
			sum[i] *= 0.8;
		}
		
		for(int i=0; i<cnum; i++) {
			System.out.printf("$%.2f\n", sum[i]);
		}
	}
}
