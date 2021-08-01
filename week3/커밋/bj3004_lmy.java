package week3.커밋;

import java.util.Scanner;

public class bj3004_lmy {
    public static void main(String[] args) 
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
		int a = N /2 +1;
		int b = N  - a + 2;
		int c = a*b;
		System.out.println(c);
}
}
