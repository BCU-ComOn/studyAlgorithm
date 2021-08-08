import java.util.Scanner;

public class bj4101_lmy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        do {
            String result = "";
            num1 = in.nextInt();
            num2 = in.nextInt();
            if (num1 == 0 && num2 == 0)
                break;
            result += (num1 > num2) ? "Yes" : "No";
            System.out.println(result);

        } while (true);

    }
}