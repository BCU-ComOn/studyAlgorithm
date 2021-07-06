package studyalgorithm;
//헛간 청약
import java.util.Scanner;

public class bj19698_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int W = s.nextInt();
		int H = s.nextInt();
		int L = s.nextInt();

		int result =0;
		
		if(N>(W/L)*(H/L))
			result = (W/L)*(H/L);
		else
			result = N;
		
		System.out.println(result);
	}
}
