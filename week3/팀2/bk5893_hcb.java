package week3.팀2;

import java.util.Scanner;

public class bk5893_hcb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		String b,d;

		b=in.nextLine();
		a=Integer.valueOf(b,2);
		in.close();
		int c=a*17;	
		d=Integer.toBinaryString(c);


		System.out.println(d);
 }
	

}