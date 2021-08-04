package week3.팀1;

import java.util.Scanner;
public class BJ19944_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[2]; //2개짜리 동적 int 배열 생성
		
		for(int i=0; i<num.length; i++) { 
			num[i] = s.nextInt(); //정수를 입력받음
		}
		
		if(num[1] <= 2) {
			System.out.println("NEWBIE!"); // 1학년 혹은 2학년일 경우
			return;
		}
		
		else if(num[1] <= num[0]) {
			System.out.println("OLDBIE!"); // 뉴비는 아니지만 n 이하일 경우
			return;
		}
		
		else {
			System.out.println("TLE!"); // 그 외의 경우
			return;
		}
	}

}
