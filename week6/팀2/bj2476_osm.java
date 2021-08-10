package week6.팀2;
import java.util.Scanner;
public class bj2476_osm {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int num =in.nextInt();
		int dice[][]= new int[num][3];
		int sum[]=new int[num];
		int max = 0;
		
		for(int i=0; i<num;i++) {
			for(int j=0; j<3;j++) 
				dice[i][j]=in.nextInt();
			}
		
		for(int i=0;i<num;i++)
		{
			if(dice[i][0] == dice[i][1] && dice[i][0] == dice[i][2] && dice[i][1] == dice[i][2])
				sum[i] = 10000 + (dice[i][0]*1000);
			else if(dice[i][0] == dice[i][1] || dice[i][0] == dice[i][2] || dice[i][1] == dice[i][2])
				sum[i] = 1000 + 100 * (dice[i][0]==dice[i][1]?dice[i][0]:dice[i][2]);
			else {
				if(dice[i][0] > dice[i][1] && dice[i][0] > dice[i][2])
					sum[i] = dice[i][0] * 100;
				else if(dice[i][1] > dice[i][0] && dice[i][1] > dice[i][2])
					sum[i] = dice[i][1] * 100;
				else
					sum[i] = dice[i][2] * 100;
			}
		}

		for(int i=0;i<num;i++)
			if(max<sum[i])
				max=sum[i];
		
		System.out.println(max);
	}
}
