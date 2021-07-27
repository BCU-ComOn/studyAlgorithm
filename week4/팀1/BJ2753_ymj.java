import java.util.Scanner;
public class BJ2753_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int leapyear = 0;
		
		if(num % 4 == 0 && num % 100 !=0 || num % 400 == 0) leapyear = 1;
		
		System.out.println(leapyear);
	}
}