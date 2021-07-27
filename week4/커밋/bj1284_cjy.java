package week4.커밋;
// 집 주소
import java.util.Scanner;

public class bj1284_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			String N = s.next();
			int cm = 0;
			if(N.equals("0"))
				break;
			
			String[] array = N.split("");
			
			for(int i=0; i<array.length; i++) {
				if(array[i].equals("1"))
					cm += 2;
				else if(array[i].equals("0"))
					cm += 4;
				else
					cm += 3;
			}
			System.out.println(cm + array.length+1);
		}
	}
}
