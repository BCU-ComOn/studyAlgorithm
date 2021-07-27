package week4.커밋;
// 윤년
import java.util.Scanner;

public class bj2753_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int year = s.nextInt();
		
		if(year % 4==0 ) {
			if(year %100 !=0 || year % 400 == 0)
				System.out.println(1);
			else
				System.out.println(0);
		}
		else
			System.out.println(0);
	}
}
