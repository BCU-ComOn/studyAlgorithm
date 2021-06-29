package studyalgorithm;
// 카드게임
import java.util.Scanner;

public class bj5522_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num =0;
		for (int i=0; i<5; i++) {
			num += s.nextInt();
		}

		System.out.println(num);
	}
}
