import java.util.Scanner;
public class BJ16486_ayj {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int D=sc.nextInt();//c의 가로 길이
		int DD=sc.nextInt();//원의 반지름 길이
		double answer=0;
		answer=(D*2) + (DD*2*3.141592);
		System.out.println(answer);
		
	}

}
