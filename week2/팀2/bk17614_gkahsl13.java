package week2.팀2;

import java.util.Scanner;
public class bk17614_gkahsl13 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a =in.nextInt();
	int count=0;
	for(int i=1;i<=a;i++) {
		if(i%10==3||i%10==6||i%10==9)
			count++;
		if(i/10==3 ||i/10==6 || i/10==9)
			count++;		
	}
	System.out.println(count);
	}

}
