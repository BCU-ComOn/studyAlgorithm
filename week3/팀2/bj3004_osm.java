package week3.팀2;

import java.util.Scanner;
public class bj3004_osm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int a;
			a=in.nextInt();
			
			int width= a/2+1;
			int height=a-width+2;
			int result=width*height;
			
			System.out.println(result);
	}
}
