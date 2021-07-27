//카드게임
package week1.팀2;

import java.util.Scanner;

public class bk5522_kk7073 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			num = in.nextInt();
			sum += num;
		}
		System.out.println(sum);

	}

}