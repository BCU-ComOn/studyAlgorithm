//방학숙제


import java.util.Scanner;
public class bk5532_kk7073 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int a = in.nextInt();	// 국어 숙제 양
		int b = in.nextInt(); 	// 수학 숙제 양
		double c = in.nextDouble();	// 국어 최대 가능 양
		double d = in.nextDouble();	// 수학 최대 가능 양
		
		int day =0;
		while(true) {
			a -= c;
			b -= d;
			day++;
			
			if(a <=0 && b <= 0) {
				break;
			}
		}
		System.out.println(l - day);
	}

}
