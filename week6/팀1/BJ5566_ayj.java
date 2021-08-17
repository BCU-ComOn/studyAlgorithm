import java.util.Scanner;
public class BJ5565_ayj {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int all=s.nextInt();
		int sum=0;
		for(int i=0;i<9;i++) {
			int price= s.nextInt();
			sum+=price;
		}
		System.out.println(all-sum);
	}

}
