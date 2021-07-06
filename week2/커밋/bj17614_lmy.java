package week2.커밋;

import java.util.Scanner;

public class bj17614_lmy {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int clap = 0;
        int scan = 0;

        for (int i = 0; i <= N; i++) {
            scan = i;
            while (scan != 0) {
                if (scan % 10 == 3 || scan % 10 == 6 || scan % 10 == 9)
                    clap++;
                scan /= 10;
            }
        }
        System.out.println(clap);
        in.close();
    }
}
