package week3.팀1;

import java.util.Scanner;
public class Week3_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String num = s.next(); //이진수를 문자열 형식으로 입력받음
		String num10000 = num + "0000"; //17의 이진수는 10001이므로 이진수 10000을 곱한 값을 num10000에 저장
		num = "0000" + num; // num10000과 원본을 대응시키기 위해 원본의 앞에도 0000의 문자열 추가
		int tmp = 0; //임시로 사용할 int 변수
		char[] temp = new char[num.length()]; // num문자열의 길이만큼의 char 배열 생성
		
		for(int i=num.length() - 1; i >= 0; i--) { // 문자열의 각자릿수를 뒤에서부터 더해서 temp 배열에 저장
			temp[tmp] = Character.forDigit((Character.getNumericValue(num10000.charAt(i)) + Character.getNumericValue(num.charAt(i))), 10);
			tmp++; //temp 배열은 앞에서부터 입력되므로 tmp 변수를 이용해 1씩 증가
		}
		
		for(int i=0; i<temp.length - 1; i++) { //temp 배열을 반복시키면서 2나 3인 것들을 1로 고침
			if(temp[i] == '2') { //2일경우
				temp[i] = '0'; //0으로 고치고
				tmp = Character.getNumericValue(temp[i+1]) + 1; //다음 자리의 것을 1 증가시킴. 즉, 올림을 구현함.
				temp[i+1] = Character.forDigit (tmp, 10); // 다시 char로 변환시킴
			}
			
			else if(temp[i] == '3') { //3일 경우
				temp[i] = '1'; //1로 고침
				tmp = Character.getNumericValue(temp[i+1]) + 1; //그리고 올림 구현
				temp[i+1] = Character.forDigit (tmp, 10);
			}
		}
		for(int i = temp.length - 1; i>=0; i--) { //temp 배열을 거꾸로 출력
			if(temp[i] == '2') { //맨 앞이 2일 경우가 있는데 그럴경우 10으로 고침
				System.out.print("10");
				continue;
			}
			System.out.print(temp[i]);
		}
	}
}