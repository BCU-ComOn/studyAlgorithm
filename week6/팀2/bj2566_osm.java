package week6.팀2;
import java.util.Scanner;
public class bj2566_osm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int line[][]= new int [10][10];
		int x=0,y=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				line[i][j]=in.nextInt();
				if(line[x][y]<line[i][j]) {   //라인마다 값저장하고 그라인에 저장된 값이 최대값이면 최대값교체
					x=i;
					y=j;
				}	
			}
		}
		System.out.println(line[x][y]);  //최대값
		System.out.println(x+1+" "+(y+1)); //최대값 라인 
	}
}
