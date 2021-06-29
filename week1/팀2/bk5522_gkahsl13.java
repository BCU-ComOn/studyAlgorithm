import java.util.Scanner;
public class bk5522_gkahsl13 {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int num=0;
		int count=0;
		for(int i=0;i<5;i++) {
			num =in.nextInt();
			count+=num;
		}
		System.out.println(count);
	}
}
