
import java.util.Scanner;

import static java.lang.Math.min;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int test = 0;
		double price;

		Scanner scan = new Scanner(System.in);

		test = scan.nextInt();

		for (int i = 0; i < test; i++) {

			price = scan.nextDouble();
			price = price * 0.8;


			System.out.println("$" + String.format("%.2f", price));
		}

	}



	}


