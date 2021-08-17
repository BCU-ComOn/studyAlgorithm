package week7.커밋;

// 플러그
import java.util.Scanner;

public class bj2010_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int max = 1;
		for (int i = 0; i < N; i++) {
			int n = s.nextInt();
			max += n;
		}
		System.out.println(max - N);
	}
}
