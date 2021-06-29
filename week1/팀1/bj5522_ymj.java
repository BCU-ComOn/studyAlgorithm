import java.util.Scanner;
public class bj5522_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		
		for(int i=0; i<5; i++) {
			num = s.nextInt();
			if(num>100 || num<0) {
				System.out.println("0이상 100이하의 수를 입력하세요");
				i--;
				continue;
			}
			sum += num;
		}
		System.out.println(sum);
	}

}