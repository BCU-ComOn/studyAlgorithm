//뉴비 문제 
package week3.팀2;

import java.util.Scanner;

public class bj19944_cbj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		if (m == 1 || m == 2) {
			System.out.println("NEWBIE!");
		} else if ((m != 1 || m != 2) && n >= m) {
			System.out.println("OLDBIE!");
		} else {
			System.out.println("TLE!");
		}

	}

}
