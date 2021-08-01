import java.util.Scanner;

public class bk2753_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int a=num;
		for(int i=num; i>0; i--){
			System.out.println(a--);
		}

	}

}