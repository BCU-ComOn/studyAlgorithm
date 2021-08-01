package week2.팀1;

import java.util.Scanner;
public class BJ19698_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[4];
		
		for(int i = 0; i<num.length; i++) {
			num[i] = s.nextInt();
		}
		
		int num2 = (num[1]/num[3]) * (num[2]/num[3]);
		if(num[0]<num2) System.out.println(num[0]);
		else System.out.println(num2);
	}
}
