import java.util.Scanner;

public class bj19944_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		if (M <= 2) System.out.println("NEWBIE!");
		else if (M <= N) System.out.println("OLDBIE!");
		else System.out.println("TLE!");
	}

}
