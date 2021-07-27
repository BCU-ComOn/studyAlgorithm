import java.util.Scanner;
public class BJ11948_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] score = new int[6];
		int minmax = 100;
		int sum = 0;
		
		for(int i=0; i<6; i++) {
			score[i] = s.nextInt();
			if(i<4) {
				if(minmax > score[i]) minmax = score[i];
				sum += score[i];
			}
		}
		
		sum -= minmax;
		
		if(score[5] > score[4]) minmax = score[5];
		else minmax = score[4];
		
		sum += minmax;
		
		System.out.printf("%d", sum);
	}
}