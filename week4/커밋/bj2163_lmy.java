import java.util.Scanner;

public class bj2163_lmy {
    static int[][] resultArray = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = Integer.parseInt(in.nextLine().trim());

        System.out.println((M * N) - 1);

        in.close();
    }
}
