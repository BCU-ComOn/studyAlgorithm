package week1.팀1;

import java.util.Scanner;
public class BJ15727_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int lenH = s. nextInt();
		
		lenH = lenH / 5 + (lenH % 5 == 0 ? 0 : 1);

		System.out.println(lenH);
	}
}