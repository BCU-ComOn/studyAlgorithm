package week4.팀2;

import java.util.Scanner;

public class bj1284_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		int len;
		while (true) {
			num = sc.next();
			len = num.length() + 1;
			if (num.equals("0"))
				break;
			for (int i = 0; i < num.length(); i++) {
				if (num.charAt(i) == '1')
					len += 2;
				else if (num.charAt(i) == '0')
					len += 4;
				else
					len += 3;
			}
			System.out.println(len);
		}
	}
}