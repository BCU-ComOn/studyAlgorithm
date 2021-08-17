package week6.팀1;
import java.util.Scanner;
import java.util.Arrays;
public class BJ2750_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt(); //입력 받을 수의 개수
		int[] num = new int[cnt];
		
		for(int i=0; i<num.length; i++) {
			num[i] = s.nextInt(); //수를 입력받음
		}
		
		Arrays.sort(num); //정렬
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]); //출력
		}
	}
}
