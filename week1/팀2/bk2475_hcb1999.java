package week1.팀2;

import java.util.Scanner;
public class bk2475_hcb1999 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int num;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
			arr[i]=arr[i]*arr[i];			
		}
		num=(arr[0]+arr[1]+arr[2]+arr[3]+arr[4])%10;
		 System.out.println(num);
	}
	   
}