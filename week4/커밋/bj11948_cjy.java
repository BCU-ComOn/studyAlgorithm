package week4.커밋;
// 과목선택
import java.util.Scanner;

public class bj11948_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arraySci = new int[4];
		int[] arraySoc = new int[2];
		
		int minSci = 100;
		int minSoc = 100;
		
		int maxSci = 0;
		int maxSoc = 0;
		
		for(int i=0; i<arraySci.length; i++) {
			arraySci[i]= s.nextInt();
			if(arraySci[i]<minSci)
				minSci = arraySci[i];
		}
		for(int i=0; i<arraySoc.length; i++) {
			arraySoc[i] = s.nextInt();
			if(arraySoc[i]<minSoc)
				minSoc = arraySoc[i];
		}

		
		for(int i=0; i<arraySci.length; i++) {
			maxSci +=arraySci[i];
		}
		for(int i=0; i<arraySoc.length; i++) {
			 maxSoc += arraySoc[i];
		}

		System.out.println((maxSci-minSci)+(maxSoc-minSoc));
	}
}
