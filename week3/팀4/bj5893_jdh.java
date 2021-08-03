package week3.팀4;

import java.util.Scanner;

public class bj5893_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String N = in.next();
		String temp;
		String result = "";
		int upnum = 0;
		int tmpnum;
		
		temp = N + "0000";
		N = "0000" + N;
		
		for (int i = 0; ; i++) {
			if (temp.length() <= i) {
				if (upnum == 1) result = Integer.toString(upnum) + result;
				break;
			}
			
			tmpnum = Character.getNumericValue(temp.charAt(temp.length() - i - 1)) + Character.getNumericValue(N.charAt(N.length() - i - 1)) + upnum;
			
			if (tmpnum > 1) {
				tmpnum -= 2;
				upnum = 1;
			}
			else upnum = 0;
			
			result = Integer.toString(tmpnum) + result;
		}
		
		System.out.println(result);
	}
	
}
