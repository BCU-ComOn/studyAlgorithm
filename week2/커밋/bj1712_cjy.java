package studyalgorithm;
// 손익분기점
import java.util.Scanner;

public class bj1712_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		long A = s.nextInt();
		long B = s.nextInt();
		long C = s.nextInt();

		long count = 0;
		if(B > C) {
			System.out.println(-1);
		}
		else{
			if(C-B == 0) {
				System.out.println(-1);
			}
			else {
				count = (A /(C - B))+1  ;
				System.out.println(count);
			}
		}
	}
}
