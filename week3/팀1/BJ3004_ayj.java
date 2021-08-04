package week3.팀1;

import java.util.Scanner;
public class BJ3004_ayj {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N =sc.nextInt();
		//1->2(2*1) 2->4(2*2) 3->6(2*3) 4->9((2*4)+1) 5->(2*5)+2 6->(2*6)+4 (x)
		//2 4 6 9 12 16 (n은 숫자가 몇번째인지) 홀수는 2*(n번째) 짝수는 n*n (ㅇ)
		/*if(N%2==0) {//짝수일때 
			System.out.println(N*N);
		}
		else if(N%2==1) {//홀수일때
			System.out.println(2*N);

		}*/
		//꼭 세로 가로 이용해서 해야되나..?위에 홀수짝수는 틀렸다고 채점 뜸..
		int R=N/2+1;
		int C=N-R+2; 
		int result= R*C;
		System.out.println(result);
	}

}