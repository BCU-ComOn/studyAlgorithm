package week2.팀2;

import java.util.Scanner;
public class bk1712_gkahsl13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] n = new int[3];

		for(int i = 0; i<3; i++) {
			n[i] = in.nextInt();
		}

		if(n[2] - n[1] <= 0) n[0] = -1;
		else n[0] = n[0] / (n[2] - n[1]) + 1;
		System.out.println(n[0]);

	}
}
