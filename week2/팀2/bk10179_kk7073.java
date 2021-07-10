//쿠폰
package Study;
import java.util.Scanner;
public class bk10179_kk7073 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		double []arr = new double [a];
		for(int i=0;i<a;i++) {
			arr[i]= in.nextDouble();
			double sum=arr[i]*0.8;
			System.out.println("$"+String.format("%.2f",sum)); 
		}
	}

}
