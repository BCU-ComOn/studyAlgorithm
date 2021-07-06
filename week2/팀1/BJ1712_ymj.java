import java.util.Scanner;
public class BJ1712_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[3];
		
		for(int i = 0; i<num.length; i++) {
			num[i] = s.nextInt();
		}
		
		if(num[2] - num[1] <= 0) num[0] = -1;
		else num[0] = num[0] / (num[2] - num[1]) + 1;
		System.out.println(num[0]);
	}
}