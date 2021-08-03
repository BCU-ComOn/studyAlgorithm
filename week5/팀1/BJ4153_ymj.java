package week5.팀1;
import java.util.Scanner;
public class BJ4153_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[3];
		int max;
		
		while(true) {
			max = 0;
			for(int i=0; i<num.length; i++) {
				num[i] = s.nextInt();
				if(num[i] * num[i] > max) max = num[i] * num[i]; //가장 큰 값의 제곱이 max로 들어감
				num[i] *= num[i]; //모든 입력값을 제곱시킴
			}
			if(num[0] == 0 && num[1] == 0 && num[2] == 0) return; // 0 0 0입력시 종료
		
			if(num[0] + num[1] + num[2] == max * 2) System.out.println("right");
			// a^2 + b^2 + c^2 - max^2 = a^2 + b^2
			// max^2 = c^2
			// a^2 + b^2 = c^2
			else System.out.println("wrong");
		}
	}
}
