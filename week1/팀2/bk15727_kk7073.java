//조별과제

package Study;
import java.util.Scanner;
public class bk15727 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num =in.nextInt();
		
		num= num/5 +(num%5==0 ? 0 : 1);
		// 삼항연산자 num이 5로 나눠지면 0 아니면 1
		System.out.println(num);

	}

}
