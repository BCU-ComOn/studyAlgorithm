import java.util.Scanner;
public class BJ4101_ayj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String result="";
		while(true) {
			int n=s.nextInt();
			int m=s.nextInt();

			if(n==0&&m==0)	break;
			result += (n>m) ? "Yes" : "No";
			System.out.println(result);
		}


	}

}
