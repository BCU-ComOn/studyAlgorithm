import java.util.Scanner;

class bj5893_lmy {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int M = in.nextInt();

    if (M == 1 || M == 2) {
      System.out.print("NEWBIE!");
    } else if (M <= N) {
      System.out.print("OLDBIE!");
    } else {
      System.out.print("TLE!");
    }
  }
}
