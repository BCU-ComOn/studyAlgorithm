import java.util.Scanner;
public class BJ2753_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int leapyear = 0; //윤년 여부 기본값은 0
		
		if(num % 4 == 0 && num % 100 !=0 || num % 400 == 0) leapyear = 1; //윤년일 경우에만 1
		//4의 배수이면서 100의 배수가 아니거나, 혹은 400의 배수일 경우
		
		System.out.println(leapyear);
	}
}