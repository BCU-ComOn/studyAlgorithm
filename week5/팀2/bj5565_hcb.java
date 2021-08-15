import java.util.Scanner;

public class bj5565_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int num[] = new int[9];
		int a=0;
			for(int i=0; i<9; i++) {
			num[i]=sc.nextInt();
			a+=num[i];
		}
		System.out.println(sum-a);
		

	}

}