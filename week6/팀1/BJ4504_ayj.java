import java.util.Scanner;
public class BJ4504_ayj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		while(true) {
			int num=s.nextInt();
			
			if(num==0) break;
			
			if(num%n==0) {
				System.out.println(num+" is a multiple of "+n+".");
			}
			else {
				System.out.println(num+" is NOT a multiple of "+n+".");
			}
		}
			
	}

}
