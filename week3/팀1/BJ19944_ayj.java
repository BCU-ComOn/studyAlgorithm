import java.util.Scanner;

public class BJ19944_ayj {

	public static void main(String[] args) {
		//올드비는 N학년 이하이면서 뉴비가 아닌 학생으로 정의m이 n 이하> OLDBIE!
		//TLE은 뉴비도 아니고 올드비도 아닌 학생
		//뉴비는 1학년 혹은 2학년
		Scanner s = new Scanner(System.in);	
		int N=s.nextInt();
		int M=s.nextInt();
		if(M==1||M==2) {
			System.out.println("NEWBIE!");
		}
		else if(M<=N) {//else if 안쓰고 if 써서 안넘어갔음
			System.out.println("OLDBIE!");
		}
		else {
			System.out.println("TLE!");
		}
	}

}