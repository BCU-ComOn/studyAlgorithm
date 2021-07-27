import java.util.Scanner;
public class BJ2163_ayj {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int M= s.nextInt();
		//n(세로)이 2면 두개로 나눠짐 한번 자름 m(가로)도 마찬가지
		//구해야할것->최소 쪼개기 횟수
		//1.N*M초콜릿 N개로 나누려면 세로를 n-1번 나눔
		//2.자른 한 조각을 가로로 m-1개로 나눔
		//3. 1에서 n개로 나눈 조각 모두 2번처럼 m-1개로 나눔->n(m-1)
		int result = (N-1)+N*(M-1);
		System.out.println(result);
	}
}
