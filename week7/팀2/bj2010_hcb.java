import java.util.Scanner;

public class bj2010_hcb {

	public static void main(String[] args) {		
		int result =0;
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0; i<a; i++) {
			int b=sc.nextInt();
			result +=b;
		}
       System.out.println(result-a+1);
	}

}