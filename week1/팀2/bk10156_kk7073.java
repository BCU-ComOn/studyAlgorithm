package Study;
import java.util.Scanner;
public class bk10156 {

	public static void main(String[] args) {
		int price,number,money,mom;
		Scanner in = new Scanner(System.in);
		price = in.nextInt();
		number = in.nextInt();
		money = in.nextInt();
		
		mom=price*number-money;
		if(mom<0)
			mom=0;
		System.out.println(mom);
	}

}
