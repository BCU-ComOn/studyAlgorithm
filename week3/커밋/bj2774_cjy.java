package week3.커밋;
// 아름다운 수
import java.util.Scanner;

public class bj2774_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i=0; i<N; i++) {
			String X = s.next();
			int result = 0;
			
			String[] array = X.split("");
			String[] num = new String[] {"0","1","2","3","4","5","6","7","8","9"};
			
			for(int j=0; j<array.length; j++) {
				for(int k=0; k<num.length; k++) {
					if(array[j].equals(num[k])) {
						result++;
						num[k]=null;
					}
				}
			}
			System.out.println(result);
		}
	}
}
