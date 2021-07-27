package week1.커밋;

import java.util.Scanner;

public class bj5532_lmy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		
		int day = 0;
		while(true) {
            A -=C ;
			B -=D ;
			day++;
			
			if(A <= 0 && B <= 0) {
				break;
			}
		}
		in.close();
		System.out.println(L - day);
	}

}
