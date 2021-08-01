package week4.팀2;
import java.util.Scanner;
public class bk11948_osm {
	public static void main(String[] args) {
		Scanner in = new 	Scanner(System.in);
		int []num = new int[6];
		int sum=0;
		int min=101;
		int max=0;
		
		for(int i=0;i<num.length;i++)
			num[i]=in.nextInt();

		for(int i=0;i<4;i++) {
			if(min >num[i])
				min=num[i];
			sum+=num[i];
		}
		if(num[4]>num[5])
			max=num[4];
		else
			max=num[5];
		
		sum-= min;
		sum+= max;
		System.out.printf("%d",sum);		
	}
}