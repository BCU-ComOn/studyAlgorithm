package week1.팀4;

import java.util.Scanner;

public class bj15727_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int L = in.nextInt();
		int count = 0;

		while (true) {
			L -= 5;
			count += 1;
			if (L <= 0)
				break;
		}
		System.out.println(count);
	}

}
