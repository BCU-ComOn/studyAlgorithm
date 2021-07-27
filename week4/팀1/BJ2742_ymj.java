import java.util.Scanner;
public class BJ2742_ymj {
	//4주차 과제 2번 기찍N

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i = num; i > 0; i--) { //num 부터 1까지 1행씩 출력
			System.out.println(i);
		}
	}
}
