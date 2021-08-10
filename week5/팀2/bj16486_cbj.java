package week5.팀2;

import java.util.Scanner;

public class bj16486_cbj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final double π =3.141592;
		int d1 =  in.nextInt();
		int d2 = in.nextInt();
		
		double sum = 0.0 ;
		
		sum =  (d1 * 2) + (2*π*d2); 
		System.out.println(sum);

	}

}
