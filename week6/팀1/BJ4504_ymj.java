package week6.팀1;
import java.util.Scanner;
public class BJ4504_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = 0, num = 0;
		
		cnt = s.nextInt(); // 배수인지 확인할 값
		
		while(true) {
			num = s.nextInt();
			if(num == 0) return; //0 입력시 종료
			else if(num % cnt == 0) System.out.printf("%d is a multiple of %d.\n", num, cnt);
            //나머지가 없어 배수일 경우
			else System.out.printf("%d is NOT a multiple of %d.\n", num, cnt);
            //그외의 배수가 아닐 경우
		}
	}
}
