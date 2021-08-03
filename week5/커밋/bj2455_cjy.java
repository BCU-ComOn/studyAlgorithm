package week5.커밋;
// 지능형 기차
import java.util.Scanner;

public class bj2455_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int[] array = new int[8];
		int max = 0;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		
		for(int i=0 ; i< array.length; i++) {
			array[i] = s.nextInt();
		}
		
		s1 = array[1];
		s2 = s1 - array[2] + array[3];
		s3 = s2 - array[4] + array[5];
		s4 = s3 - array[6];
		
		if(s1 > max)
			max = s1;
		if(s2 > max)
			max = s2;
		if(s3 > max)
			max = s3;
		if(s4 > max)
			max = s4;
		
		System.out.println(max);
	}
}
