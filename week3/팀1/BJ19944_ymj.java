import java.util.Scanner;
public class BJ19944_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[2];
		
		for(int i=0; i<num.length; i++) {
			num[i] = s.nextInt();
		}
		
		if(num[1] <= 2) {
			System.out.println("NEWBIE!");
			return;
		}
		
		else if(num[1] <= num[0]) {
			System.out.println("OLDBIE!");
			return;
		}
		
		else {
			System.out.println("TLE!");
			return;
		}
	}

}