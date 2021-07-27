package week2.커밋;
//쿠폰
import java.util.Scanner;

public class bj10179_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double N =0;
		double[] array = new double[s.nextInt()];
		
		for(int i=0; i<array.length; i++) {
			array[i] = s.nextDouble();
			double result =(array[i]*0.8);
			
			String st = Double.toString(result);
			if(st.charAt(st.length()-1)=='0') {
				st += "0";
				System.out.println("$"+ st);
			}
			else
				System.out.printf("$%.2f\n", result);
		}
	}
}
