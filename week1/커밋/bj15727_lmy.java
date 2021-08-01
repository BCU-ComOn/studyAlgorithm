package week1.커밋;

import java.util.Scanner;

public class bj15727_lmy {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if (N % 5 == 0)
            System.out.println(N / 5);
        else
            System.out.println(N / 5 + 1);

    }

}
