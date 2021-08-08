import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int index = 0;
		for(int i=0;i<5;i++)
		{
			int sum = 0;
			for(int j=0;j<4;j++)
			{
				int score = sc.nextInt();
				sum += score;
				if(max<=sum) {
					max = sum;
					index = i+1;
				}
			}
		}
		System.out.print(index+ " " +max);
		sc.close();
   }
}
//아래는 내가 코딩친거 답이랑 뭐가 다른지 모르게따??
/*import java.util.Scanner;
public class BJ2953_ayj {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int sum=0;
		int max=0;
		int num=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				int n= s.nextInt();
				sum+=n;
				if(sum>=max) {
					max=sum;
					num=i+1;//i만 표시하면 X, +1해주기
				}
			}
		}
		System.out.println(num+" "+max);
		
	}

}*/