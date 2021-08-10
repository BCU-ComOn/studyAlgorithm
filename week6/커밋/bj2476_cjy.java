package week6.커밋;

//주사위 게임
import java.util.Scanner;

public class bj2476_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int max = 0;

		for (int i = 0; i < N; i++) {
			int num1 = s.nextInt();
			int num2 = s.nextInt();
			int num3 = s.nextInt();
			int score = 0;
			int numMax = 0;

			if (num1 == num2 && num1 == num3 && num2 == num3) {
				score = 10000 + num1 * 1000;
			} else if (num1 == num2 || num1 == num3) {
				score = 1000 + num1 * 100;
			} else if (num2 == num3) {
				score = 1000 + num2 * 100;
			} else {
				if (numMax < num1)
					numMax = num1;
				if (numMax < num2)
					numMax = num2;
				if (numMax < num3)
					numMax = num3;

				score = numMax * 100;
			}

			if (max < score)
				max = score;
		}
		System.out.println(max);
	}
}
