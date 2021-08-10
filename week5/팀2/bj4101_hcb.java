package week5.팀2;

import java.util.Scanner;

public class bj4101_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1; 
		int num2;
		while(true) {
				 
			    num1=sc.nextInt();
			    num2=sc.nextInt();		 
		     if(num1==0 && num2==0) break;
		     if(num1>num2) System.out.println("yes");
		     else System.out.println("no");
		    
		 }
	
	}

}