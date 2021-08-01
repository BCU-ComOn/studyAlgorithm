import java.util.Scanner;

public class bk2742_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%4==0&&num%400==0) System.out.println("1");
        else if(num%4==0&&num%100!=0) System.out.println("1");
        else if(num%4==0&&num%100==0) System.out.println("0");
        else System.out.println("0");
	}

}
