package week3.커밋;
// 뉴비의 기준은 뭘까?
import java.util.Scanner;

public class bj19944_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		if(2>=M)
			System.out.println("NEWBIE!");
		else if (N>=M)
			System.out.println("OLDBIE!");
		else
			System.out.println("TLE!");
	}
}
