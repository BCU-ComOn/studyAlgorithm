import java.util.Scanner;
public class Week2_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] chess = new int[6];
		int chk = 1;
		
		for(int i = 0; i<chess.length; i++) {
			chess[i] = s.nextInt();
			if(i == 2) chk += 1;
			if(i == 5) chk += 6;
			chess[i] = chk - chess[i];
		}
		
		System.out.printf(("%d %d %d %d %d %d"), chess[0], chess[1], chess[2], chess[3], chess[4], chess[5]);
	}
}