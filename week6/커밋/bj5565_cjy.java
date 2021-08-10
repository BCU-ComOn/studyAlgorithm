package week6.커밋;

// 영수증
import java.util.Scanner;

public class bj5565_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 0; i < 9; i++) {
			num -= s.nextInt();
		}
		System.out.println(num);
	}
}
