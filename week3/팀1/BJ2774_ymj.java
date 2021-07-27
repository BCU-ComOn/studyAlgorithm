import java.util.Scanner;
public class BJ2774_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rep = s.nextInt(); // 입력받을 숫자의 개수
	
		String[] Snum = new String[rep]; //입력 받을 만큼의 문자열 배열 생성
		int[] cnt = new int[rep]; //입력 맏을 만큼의 카운터 변수배열 생성
		
		for(int i = 0; i < rep; i++) { //rep 만큼 반복
			Snum[i] = s.next(); //숫자를 문자열로 입력받음
			
			for(int j = 0; j <= 9; j++) { //0~9까지의 숫자
				for(int k = 0; k < Snum[i].length(); k++) { //문자열 하나하나 비교
					if(Character.getNumericValue(Snum[i].charAt(k)) == j) { //문자열을 하나하나 나눠서 정수화 시켰을때 0~9까지와 같은지 확인
						cnt[i]++; // 같으면 카운터 증가
						break; //0~9까지 중 다음 숫자로 넘어감
					}
				}
			}
		}
		for(int i = 0; i < rep; i++) {
			System.out.println(cnt[i]); //각 카운터 변수 출력
		}
	}
}