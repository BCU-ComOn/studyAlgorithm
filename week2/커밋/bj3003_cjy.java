package week2.커밋;
//킹, 퀸, 룩, 비숍, 나이트, 폰
import java.util.Scanner;

public class bj3003_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int K = s.nextInt() - 1;
		int Q = s.nextInt() - 1;
		int R = s.nextInt() - 2;
		int B = s.nextInt() - 2;
		int Kn = s.nextInt() - 2;
		int P = s.nextInt() - 8;
		System.out.println(K*-1+" "+Q*-1+" "+R*-1+" "
				+B*-1+" "+Kn*-1+" "+P*-1);
	}
}
