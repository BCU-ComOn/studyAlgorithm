package studyalgorithm;
// 조별과제를 하려는데 조장이 사라졌다
import java.util.Scanner;

public class bj15727_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int m = s.nextInt();
		int result =0;
		if (m%5!=0)
			result = m / 5 + 1;
		else
			result = m / 5;
		
		System.out.println(result);
	}
}
