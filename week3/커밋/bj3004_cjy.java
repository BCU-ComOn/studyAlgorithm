
// 체스판 조각
import java.util.Scanner;

public class bj3004_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		int x = N / 2;
		int y = N - x;
		
		System.out.println((x+1)*(y+1));
	}
}
