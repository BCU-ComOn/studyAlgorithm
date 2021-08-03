package week5.커밋;
// 직각삼각형
import java.util.Scanner;

public class bj4153_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		
		while(true) {
			int[] array = new int[3];
			for(int i=0; i< array.length; i++) {
				array[i] = s.nextInt();
			}
			if(array[0] == 0 && array[1] == 0 && array[2] == 0 )
				break;
			
			if(array[0]*array[0] + array[1]*array[1] == array[2]*array[2])
				System.out.println("right");
			else if(array[2]*array[2] + array[0]*array[0] == array[1]*array[1])
				System.out.println("right");
			else if(array[2]*array[2] + array[1]*array[1] == array[0]*array[0])
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}
