package week2.팀2;

import java.util.Scanner;
public class bk1712_kk7073 {

	public static void main(String[] args) {
		int fix,change,price,profit;
		Scanner sc = new Scanner(System.in);
		fix = sc.nextInt();
		change = sc.nextInt();
		price = sc.nextInt();
		if(change>price) {
			profit = -1;
			System.out.println(profit);
		}
		else if (change<price) {
			profit = (fix / (price-change) + 1);
			System.out.println(profit);
		}
		
	
			

		
	
				

	}

}