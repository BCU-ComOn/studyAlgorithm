package week2.팀2;

import java.util.Scanner;

public class bk19698_hcb1999 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int W = s.nextInt();
		int H = s.nextInt();
		int L = s.nextInt();

		int result =0;
		
		if(N>(W/L)*(H/L))
			result = (W/L)*(H/L);
		else
			result = N;
		
		System.out.println(result);
	}
}