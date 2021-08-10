import java.util.Scanner;

public class bj4505_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		while(true) {			
			int num1=sc.nextInt();
			if(num1==0) break;
			if(num1%num==0) System.out.println(num1+" is a multiple of "+ num+".");
			else System.out.println(num1+" is NOT a multiple of "+ num+".");
			
		}
	}

}