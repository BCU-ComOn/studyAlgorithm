import java.util.Scanner;
public class BJ2163_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] num = new int[2];
		
		for(int i=0; i<2; i++) {
			num[i] = s.nextInt();
		}
		
		System.out.printf("%d", ((num[0] - 1) + num[0] * (num[1] - 1)));
		// (n-1) + n * (m-1)
	}
}