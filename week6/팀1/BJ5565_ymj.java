package week6.팀1;
import java.util.Scanner;
public class BJ5565_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int price = s.nextInt();
		
		for(int i=0; i<9; i++) {
			price -= s.nextInt();
		}
		System.out.println(price);
	}
}
