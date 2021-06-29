import java.util.Scanner;
public class bk15727_gkahsl13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num =in.nextInt();
		
		num= num/5 +(num%5==0 ? 0 : 1);
		
		System.out.println(num);
	}

}
