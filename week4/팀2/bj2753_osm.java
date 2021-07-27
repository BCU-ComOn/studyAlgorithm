package week4.팀2;
import java.util.Scanner;
public class bj2753_osm {
	public static void main(String[] args) {
		Scanner in = new 	Scanner(System.in);
		int x=in.nextInt();
		
		if(x%4==0 && x%100 !=0 ||x%400==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
