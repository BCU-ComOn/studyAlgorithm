import java.util.Scanner;
public class BJ4880_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[3];
		
		while(true) {
			for(int i=0; i<num.length; i++) {
				num[i] = s.nextInt();
			}
			if(num[0] == 0 && num[1] == 0 && num[2] == 0) return;
			
			if((num[1] - num[0]) == (num[2] - num[1])) {
				System.out.printf("AP %d\n", num[2] + (num[1] - num[0]));
			}
			
			else if((num[1] / num[0]) == (num[2] / num[1])) {
				System.out.printf("GP %d\n", num[2] * (num[1] / num[0]));
			}
		}
	}
}
