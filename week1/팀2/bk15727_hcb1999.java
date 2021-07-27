import java.util.Scanner;
public class bk15727_hcb1999 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		if(num%4==0) num=num/4;
		else num=num/4+1;
		 System.out.println(num);
	}
	

}