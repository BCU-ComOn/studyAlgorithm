package week5.커밋;

// 나는 요리사다
import java.util.Scanner;

public class bj2953_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[][] array = new int[5][4];
		int line = 0;
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = s.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			int num = 0;
			for (int j = 0; j < array[i].length; j++) {
				num += array[i][j];
			}
			if (num > max) {
				line = i + 1;
				max = num;
			}
		}
		System.out.println(line + " " + max);
	}
}
