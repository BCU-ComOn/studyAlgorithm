package week4.팀2;

import java.util.Scanner;

public class bj2742_hcb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 4 == 0 && num % 400 == 0)
            System.out.println("1");
        else if (num % 4 == 0 && num % 100 != 0)
            System.out.println("1");
        else if (num % 4 == 0 && num % 100 == 0)
            System.out.println("0");
        else
            System.out.println("0");
    }

}
