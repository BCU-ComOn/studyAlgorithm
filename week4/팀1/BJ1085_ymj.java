import java.util.Scanner;
public class BJ1085_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[4];
		
		for(int i=0; i<num.length; i++) {
			num[i] = s.nextInt();
		}
		
		for(int i=0; i<2; i++) {
			if(num[i] > num[i+2]) num[i+2] = num[i] - num[i+2];
			else num[i+2] = num[i+2] - num[i];
		}
		
		for(int i=0; i<4; i++) {
			if(num[i] < num[0]) num[0] = num[i];
		}
		
		System.out.println(num[0]);
	}
}