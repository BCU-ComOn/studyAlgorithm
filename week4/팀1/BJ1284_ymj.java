package week4.팀1;

import java.util.Scanner;

public class BJ1284_ymj {
	// 4주차 과제 3번 집 주소

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String snum; // 호수
		int len; // 길이
		while (true) {
			snum = s.next(); // 문자열 입력
			len = snum.length() + 1; // 빈칸의 길이 (글씨 사이 + 좌우 양옆)
			if (snum.equals("0"))
				return; // 0 입력시 종료
			for (int i = 0; i < snum.length(); i++) {
				if (snum.charAt(i) == '1')
					len += 2; // 1일경우 2추가
				else if (snum.charAt(i) == '0')
					len += 4; // 0일경우 4추가
				else
					len += 3; // 그외의 경우 3추가
			}
			System.out.println(len);
		}
	}
}