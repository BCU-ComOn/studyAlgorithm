package week5.커밋;

// 운동장 한 바퀴
import java.util.Scanner;

public class bj16486_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double d1 = s.nextDouble();
		double d2 = s.nextDouble();

		double result = 0.0;

		result = (d1 * 2) + (d2 * 2 * 3.141592);

		System.out.println(result);
	}
}
