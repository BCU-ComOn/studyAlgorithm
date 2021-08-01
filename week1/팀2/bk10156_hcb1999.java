package week1.팀2;

import java.util.Scanner;

public class bk10156_hcb1999 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
		int sum=0;
		for(int i=0; i<3; i++) {
		 num[i] =sc.nextInt();
	 		}
		sum=num[0]*num[1];
		if(sum<=num[2]) System.out.println(0);
		else System.out.println(sum-num[2]);
		

	}

}
