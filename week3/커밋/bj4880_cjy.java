
// 다음수
import java.util.Scanner;

public class bj4880_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			int x = s.nextInt();
			int y = s.nextInt();
			int z = s.nextInt();
			
			if(x == 0 && y == 0 && z == 0)
				break;
			
			if(y-x == z-y) {
				int ap = (z-y) + z;
				System.out.println("AP"+ " " + ap);
			}
			else if(y/x == z/y) {
				int gp = z/y;
				System.out.println("GP" + " " + gp*z);
			}
		}
	}
}
