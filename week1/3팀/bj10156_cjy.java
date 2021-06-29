package studyalgorithm;
// 과자
import java.util.Scanner;

public class bj10156_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int K = s.nextInt();
		int M = s.nextInt();
		
		int pay = K * M;
		
		int money = s.nextInt();
		
		if (pay - money > 0)
			System.out.println(pay - money);
		else
			System.out.println(0);
	}

}
