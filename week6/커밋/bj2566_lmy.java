import java.util.Scanner;

public class bj2566_lmy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = arr[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                arr[i][j] = scan.nextInt();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);
        scan.close();
    }
}