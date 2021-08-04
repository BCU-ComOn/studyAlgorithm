package week5.커밋;

// 크냐?
import java.util.Scanner;

public class bj4101_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			int a = s.nextInt();
			int b = s.nextInt();

			if (a == 0 && b == 0)
				break;

			if (a > b)
				System.out.println("Yes");
			else if (a < b || a == b)
				System.out.println("No");
		}
	}
}
