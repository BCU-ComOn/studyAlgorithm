package studyalgorithm;
//방학숙제
import java.util.Scanner;

public class bj5532_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int L = s.nextInt();
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int D = s.nextInt();
		int kor = 0;
		int math = 0;
		
		if (A%C!=0)
			kor = A / C + 1;
		else
			kor = A / C;
		
		if (B%D!=0)
			math = B / D + 1;
		else
			math = B /D;

		if (kor < math)
			System.out.println(L - math);
		else if(kor > math)
			System.out.println(L - kor);
		else 
			System.out.println(L - kor);
		
	}
}
