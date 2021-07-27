package week1.커밋;
//검증수
import java.util.Scanner;

public class bj2475_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum =0;
		int x = 0;
		for (int i=0; i<5; i++) {
			x = s.nextInt();
			sum += x*x;
		}
		System.out.println(sum%10);
	}
}
