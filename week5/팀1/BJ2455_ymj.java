package week5.팀1;
import java.util.Scanner;
public class BJ2455_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[4]; //각 역사이의 승객 수
		int gOn = 0; //탑승객
		int gOff = 0; //하차객
		int max = 0; // 최대 승객 수
		
		for(int i=0; i<num.length; i++) {
			gOff = s.nextInt();
			gOn = s.nextInt();
			if(i==0) num[0] = gOn; //첫 역에서는 탑승객만 고려
			else num[i] = num[i-1] - gOff + gOn; // 두번째 역 부터는 (전 역 승객 - 하차객 + 탑승객)
			if(num[i] > max) max = num[i]; //최대 승객수는 max 변수로 입력
		}
		System.out.println(max);
	}
}
