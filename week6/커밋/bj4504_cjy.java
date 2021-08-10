package week6.커밋;

// 배수 찾기
import java.util.Scanner;

public class bj4504_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (true) {
			int num = s.nextInt();
			if (num == 0)
				break;
			if (num % n == 0)
				System.out.println(num + " is a multiple of " + n + ".");
			else
				System.out.println(num + " is NOT a multiple of " + n + ".");
		}
	}
}
