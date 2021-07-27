package week4
import java.util.Scanner;
public class bj2163_osm {
	public static void main(String[] args) {
		Scanner in = new 	Scanner(System.in);
		int []num = new int[2];
		
		for(int i=0;i<num.length;i++)
			num[i]=in.nextInt();
		
		System.out.printf("%d",num[0]*num[1]-1);
	}
}
