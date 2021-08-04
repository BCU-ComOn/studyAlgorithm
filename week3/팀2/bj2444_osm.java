package week3.팀2;

import java.util.Scanner;
public class bj2444_osm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int a;
			a=in.nextInt();

		for(int i=1 ; i<a;i++) {
			for(int j=a-i;j>0;j--) 
				System.out.print(" ");
			
			for(int j=0;j<2*i-1;j++) 
				System.out.print("*");					

			System.out.println("");
		}
		
		for(int i=a;i>0 ;i--) {
			for(int j=a-i;j>0;j--)
				System.out.print(" ");
			
			for(int j=0;j<2*i-1;j++)
				System.out.print("*");
			
		System.out.println("");
		}
	}
}
