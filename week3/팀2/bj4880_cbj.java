//다음수

/*숫자 3개가 주어짐
a1 a2 a3 3개 받고나서.

a2 - a1 = a3-a2 가 같으면 등차 조건1

a2 % a1 = a3 % a2 가 같으면 등비 조건2

조건문 걸어서 

변수하나 만들고

변수 조건1 이면 a3 + a3-a2
변수 조건 2 이면 a3 + a3%2
*/
package week3.팀2;

import java.util.Scanner;

public class bj4880_cbj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] = new int[3];
		while (true) {

			for (int i = 0; i < 3; i++) {
				a[i] = in.nextInt();
			}
			if (a[0] == 0 && a[1] == 0 && a[2] == 0) {
				break;
			} else if (a[1] - a[0] == a[2] - a[1]) {
				int next = a[2] + (a[2] - a[1]);
				System.out.println("AP" + " " + next);
			} else if (a[1] / a[0] == a[2] / a[1]) {
				int next1 = a[2] * (a[2] / a[1]);
				System.out.println("GP" + " " + next1);
			}

		}

	}

}
