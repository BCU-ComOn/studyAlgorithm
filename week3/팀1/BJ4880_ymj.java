import java.util.Scanner;
public class Week3_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[3]; // 동적 int 배열 3개 생성
		
		while(true) { // 열이 얼마나 될지 모르므로 무한반복문 수행
			for(int i=0; i<num.length; i++) {
				num[i] = s.nextInt(); // 한 열에 있는 3개의 정수를 입력받음
			}
			if(num[0] == 0 && num[1] == 0 && num[2] == 0) return; // 0 0 0 을 입력받으면 종료
			
			if((num[1] - num[0]) == (num[2] - num[1])) { // 등차수열일 경우
				System.out.printf("AP %d\n", num[2] + (num[1] - num[0]));
			}
			
			else if((num[1] / num[0]) == (num[2] / num[1])) { //등비수열일 경우
				System.out.printf("GP %d\n", num[2] * (num[1] / num[0]));
			}
		}
	}
}
