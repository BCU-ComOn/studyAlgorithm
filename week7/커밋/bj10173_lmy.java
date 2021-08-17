import java.util.Scanner;

public class bj10173_lmy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        while (true) {
            input = in.nextLine().trim();
            if (input.contains("EOI"))
                break;
            if ((input.toUpperCase().contains("Nemo".toUpperCase())) == true) {
                System.out.println("Found");
            } else if ((input.toUpperCase().contains("Nemo".toUpperCase())) == false) {
                System.out.println("Missing");
            }
        }
    }

}