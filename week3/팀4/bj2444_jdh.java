import java.util.Scanner;

public class bj2444_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int stars = 1;
		
		for (int i = 0; i < 2 * N - 1; i++) {
			for (int b = 0; b < N - ((stars + 1) / 2); b++) {
				System.out.print(" ");
			}
			for (int s = 0; s < stars; s++) {
				System.out.print("*");
			}
			System.out.println("");
			
			if (i >= N - 1) stars -= 2;
			else stars += 2;
		}
	}

}
