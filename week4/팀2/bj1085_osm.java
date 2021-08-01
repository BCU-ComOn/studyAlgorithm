package week4.팀2;
import java.util.Scanner;
public class bj1085_osm {
	public static void main(String[] args) {
		Scanner in = new 	Scanner(System.in);
		int[] num = new int[4];
		
		for(int i=0; i<num.length; i++) {
			num[i] = in.nextInt();
		}
		
		int x=Math.min(num[0], num[2]-num[0]);
		int y=Math.min(num[1],num[3]-num[1]);
		
		System.out.println(Math.min(x, y));		
	}
}
