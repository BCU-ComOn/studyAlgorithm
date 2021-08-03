package week3.팀4;

import java.util.Scanner;

public class bj2774_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		String X[] = new String[T];
		
		for (int i = 0; i < X.length; i++) X[i] = in.next();
		
		for (int i = 0; i < X.length; i++) {
			String temp = "";
			int result = 0;
			
			for (int k = 0; k < X[i].length(); k++) {
				if (temp.indexOf(X[i].charAt(k)) == -1) {
					result++;
					temp += X[i].charAt(k);
				}
			}
			
			System.out.println(result);
		}
	}

}
