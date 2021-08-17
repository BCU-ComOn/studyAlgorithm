import java.util.Scanner;

public class bj5363_lmy {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();

        for (int i = 0; i < N; i++) {
            String str = s.nextLine();
            String[] array = str.split(" ");

            for (int j = 0; j < 2; j++) {
                String tmp = array[0];
                for (int k = 0; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
                array[array.length - 1] = tmp;
            }

            for (int j = 0; j < array.length; j++) {
                if (j == array.length - 1) {
                    System.out.println(array[j]);
                    break;
                }
                System.out.print(array[j] + " ");
            }
        }
    }
}
