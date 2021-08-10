package week5.팀1;
import java.util.Scanner;
public class BJ10797_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[5]; //차량 5대
		int rn = s.nextInt(); //부제
		int cnt = 0; //카운터
		
		for(int i=0; i<num.length; i++) {
			num[i] = s.nextInt(); //입력받고
			if(num[i] == rn) cnt++; //부제 번호일 경우 카운트 증가
		}
		System.out.println(cnt); //카운트 출력
	}
}
