import java.util.Scanner;

public class bj11948_lmy {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int MINarr[] = new int[4];
        int MANarr[] = new int[2];
        int sum = 0;
        int s = 0;
        int t = 0;

        for (int i = 0; i < 4; i++) {
            MINarr[i] = Integer.parseInt(in.next());
            sum += MINarr[i];

        }

        s = MINarr[0];
        for (int i = 0; i < 4; i++) {
            if (MINarr[i] < s) {
                s = MINarr[i];
            }
        }

        for (int i = 0; i < 2; i++) {
            MANarr[i] = Integer.parseInt(in.next());
            if (MANarr[0] >= MANarr[1]) {
                t = MANarr[0];
            } else
                t = MANarr[1];

        }
        System.out.println(sum - s + t);

        in.close();

    }

}
