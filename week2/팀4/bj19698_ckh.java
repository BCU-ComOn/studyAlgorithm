
import java.util.Scanner;

import static java.lang.Math.min;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int N, W, H, L;

		Scanner scan = new Scanner(System.in);
		N=scan.nextInt();
		W=scan.nextInt();
		H=scan.nextInt();
		L=scan.nextInt();

		int result = min((W / L) * (H / L), N);


		System.out.println(result);


	}
}

