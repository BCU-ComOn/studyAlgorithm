package week2.커밋;

import java.util.Scanner;

public class bj19698_lmy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int W = in.nextInt();
        int H = in.nextInt();
        int L = in.nextInt();

        int result = 0;

        if (N > (W / L) * (H / L))
            result = (W / L) * (H / L);
        else
            result = N;

        System.out.println(result);
    }
}
