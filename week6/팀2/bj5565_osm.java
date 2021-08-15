package week6.팀2;
import java.util.Scanner;
public class bj5565_osm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int money=in.nextInt();
		int book[]=new int[9];
		int sum=0;
		
		for(int i=0; i<9;i++) {
			book[i]=in.nextInt();
			sum+=book[i];
		}
		
		int last=money-sum;
	
		System.out.println(last);
	}

}
