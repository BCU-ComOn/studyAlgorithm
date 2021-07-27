import java.util.Scanner;
public class bk4880_gkahsl13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int a,b,c;
			a=in.nextInt();
			b=in.nextInt();
			c=in.nextInt();
			
			boolean AP = b-a == c-b;
			boolean GP = b*b == a*c;
			
			if(a==0 && b==0 &&c==0)
				break;
			if(AP)
				System.out.println("AP "+(c+(c-b)));	
			if(GP)
				System.out.println("GP "+c*(c/b));	
		}	
	}
}
