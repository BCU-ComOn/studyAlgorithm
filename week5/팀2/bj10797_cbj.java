package week5.팀2;

import java.util.Scanner;

public class bj10797_cbj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int day = in.nextInt();
		int a[] =new int[5];
		int count =0;
		for(int i = 0; i<5; i++) {
			a[i]=in.nextInt();
			if(a[i]==day) 
				count+=1;
			
		}
		System.out.println(count);

	}

}
