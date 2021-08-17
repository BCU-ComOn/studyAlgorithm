package week6.팀1;
import java.util.Scanner;
public class BJ2265_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max = 0, row = 0, line = 0;
		int[][] board = new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				board[i][j] = s.nextInt();
				if(max < board[i][j]) {
					max = board[i][j];
					line = i;
					row = j;
				}
			}
		}
		System.out.println(max);
		System.out.printf("%d %d", line + 1, row + 1);
	}
}