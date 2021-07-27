package week2.팀2;

import java.util.Scanner;
public class bk3003_kk7073 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int king = in.nextInt();
		int queen = in.nextInt();
		int rook = in.nextInt();
		int bishop = in.nextInt();
		int knight = in.nextInt();
		int pawn = in.nextInt();
		
		System.out.printf("%d %d %d %d %d %d\n",1-king, 1-queen,2-rook,2-bishop,2-knight,8-pawn);




	}

}
