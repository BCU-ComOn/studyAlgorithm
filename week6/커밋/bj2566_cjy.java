package week6.커밋;

// 최댓값
import java.util.Scanner;

public class bj2566_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] array = new int[9][9];
		int max = 0;
		int row = 0;
		int col = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = s.nextInt();
				if (max < array[i][j]) {
					max = array[i][j];
					row = i + 1;
					col = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(row + " " + col);
	}
}
