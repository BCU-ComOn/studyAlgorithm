package week6.팀2;
import java.util.Scanner;
public class bj4504_osm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count= in.nextInt();  //배수 입력
		
		while(true) {  //무한반복
			int value = in.nextInt();
			if(value==0)   //0이면 반복 종료
				break;
			if(value%count==0)
				System.out.println(value+" is a multiple of "+count+"."); //배수면 출력 아니면 밑에문 출력
			else
				System.out.println(value+" is NOT a multiple of "+count+".");
		}

	}

}
