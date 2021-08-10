package week3.팀2;

import java.util.Scanner;
public class bj19944_gkahsl13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,m;
		n=in.nextInt();
		m=in.nextInt();
		
		if(m<3)
			System.out.println("NEWBIE!");
		else if(m<=n)
			System.out.println("OLDBIE!");
		else
			System.out.println("TLE!");
		
	}

}
