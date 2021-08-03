package week5.팀1;
import java.util.Scanner;
public class BJ16486_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int width = s.nextInt(); //가로 d1
		int radius = s.nextInt(); //반지름 d2
		
		float round = (float) ((2 * width) + (2 * 3.141592 * radius));
		//d1 * 2 + 2ㅠr
		
		System.out.printf("%.6f", round);
		// %.6f 로 소수점 6째자리까지 출력
	}
}
