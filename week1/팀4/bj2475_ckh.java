import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanf = new Scanner(System.in);


        int code = 0 ;
        int verification = 0;

        for (int i = 0 ; i < 5 ;i++ ) {
            int number = 0;
            number= scanf.nextInt();

            code += number * number;

        }

        verification = code % 10;

        System.out.println(verification);

    }

}
