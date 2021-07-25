import java.util.Scanner;

public class bk3004_hcb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int row = n /2 +1;
		int col = n  - row + 2;
		int result = row*col;
		System.out.println(result);

	}

}