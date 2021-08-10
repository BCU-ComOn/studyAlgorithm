package week4.팀2;

import java.util.Scanner;

public class bj1284_cbj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {

			String a = in.next();

			int count = 0;

			if (a.equals("0"))
				System.exit(0); // 0 쓸때까지 계속 반복
			for (int i = 0; i < a.length(); i++) {
				String b = a.substring(i, i + 1);

				if (b.equals("1"))
					count += 3;
				else if (b.equals("0"))
					count += 5;
				else
					count += 4;
			}

			System.out.println(count + 1); // 앞에 빈공간 하나 때문 +1
		}

	}

}
