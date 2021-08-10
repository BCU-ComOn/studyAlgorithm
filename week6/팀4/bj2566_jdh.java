package week6.팀4;
import java.util.Scanner;

public class bj2566_jdh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int max = 0;
		int maxX = 0;
		int maxY = 0;
		
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 9; k++) {
				int N = in.nextInt();
				
				if (N > max) {
					max = N;
					maxX = i + 1;
					maxY = k + 1;
				}
			}
		}
		
		System.out.println(max + "\n" + maxX + " " + maxY);
	}

}
