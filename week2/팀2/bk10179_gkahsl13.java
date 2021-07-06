import java.util.Scanner;
public class bk10179_gkahsl13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		double[]b = new double[a];
		double result = 0;
		
		for(int i=0;i<a;i++) {
			b[i]=in.nextDouble();
			result=b[i]*0.8;
			System.out.println("$"+String.format("%.2f",result));
		}
	}
}
