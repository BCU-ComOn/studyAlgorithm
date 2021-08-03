import java.util.Scanner;
public class BJ2455_ayj {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int max=0;
		int sum=0;
		for(int i=0;i<4;i++) {
			int out=s.nextInt();
			int in=s.nextInt();
			sum=sum+in-out;
			max=Math.max(max,sum);
		}
		System.out.println(max);
	}

}
