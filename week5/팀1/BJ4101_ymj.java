package week5.팀1;
import java.util.Scanner;
public class BJ4101_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[2];
		
		while(true) {
			for(int i=0; i<num.length; i++) {
				num[i] = s.nextInt();
			}
			if(num[0] == 0 && num[1] == 0) return; //0 0 입력 시 종료
			
			if(num[0] > num[1]) System.out.println("Yes"); //좌측의 수가 우측의 수보다 클 시 Yes
			else System.out.println("No"); //아닌 경우 No
		}
	}
}
