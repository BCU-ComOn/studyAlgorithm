package week5.팀1;
import java.util.Scanner;
public class BJ2953_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[5]; //5명의 참가자
		int max = 0, mnum = 0; //최대 점수와 그 점수를 받은 참가자 번호
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<4; j++) num[i] += s.nextInt(); //1번 참가자 점수의 총합
			if(num[i] > max) max = num[i]; //가장 높은 점수의 값 max
		}
		
		for(int i=0; i<num.length; i++) {
			if(num[i] == max) { //최대값을 받은 참가자의 번호 알아내기
				mnum = i;
				break;
			}
		}
		System.out.printf("%d %d", mnum + 1, max);
	}
}
