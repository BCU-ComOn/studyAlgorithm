package Study;
import java.util.Scanner;
public class bc19698_kk7073 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cow = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		int l = in.nextInt();
		int max=0;
		
		max= (w/l)*(h/l);
		if(max>cow)
			max=cow;

		System.out.println(max);

	}

}
