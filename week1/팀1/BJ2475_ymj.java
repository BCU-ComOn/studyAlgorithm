package week1.팀1;

import java.util.Scanner;
public class BJ2475_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		
		for(int i=0; i<5; i++) {
			num = s.nextInt();
			num = num * num;
			sum += num;
		}
		sum = sum%10;
		System.out.println(sum);
	}
}
