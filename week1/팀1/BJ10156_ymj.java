package week1.팀1;

import java.util.Scanner;
public class BJ10156_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[3];
		
		for(int i = 0; i<num.length; i++) {
			num[i] = s.nextInt();
		}
		num[0] = num[0] * num[1] - num[2];
		if(num[0]<0) num[0] = 0;
		System.out.println(num[0]);
	}
}