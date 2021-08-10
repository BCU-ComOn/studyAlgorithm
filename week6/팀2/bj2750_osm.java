package week6.팀2;
import java.util.Scanner;
public class bj2750_osm {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int count =in.nextInt();
		int num[]=new int[count];
		int temp;
		
		for(int i=0;i<count;i++) {
			num[i]=in.nextInt();
		}
		
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
			
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				}
		}
		for(int i=0;i<count;i++)
			System.out.println(num[i]);
	}

}
