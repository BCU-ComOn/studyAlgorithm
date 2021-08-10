package week5.팀2;

import java.util.Scanner;

public class bj2455_cbj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int leave[] = new int[4];
		int ride[]  = new int[4];
		int sum[] = new int [4];
		
		for(int i =0; i<4; i++) {
			leave[i] = in.nextInt();
			ride [i] = in.nextInt();
			if(i!=0) {
				sum[i] =sum[i-1] + ride[i] - leave[i];
			}
			else sum[i] =ride[i] - leave[i];
		}
		int max = sum[0];
		for (int z=1; z<4; z++) {
			if(max<sum[z]) {
				max = sum[z];
			}
		}
		
		System.out.println(max);
	}

}
