package week6.팀4;
import java.util.Scanner;

public class bj4504_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		while (true) {
			int number = in.nextInt();
			
			if (number == 0) break;
			
			if (number % n == 0) System.out.printf("%d is a multiple of %d.\n", number, n);
			else System.out.printf("%d is NOT a multiple of %d.\n", number, n);
		}
		
		in.close();
	}

}
