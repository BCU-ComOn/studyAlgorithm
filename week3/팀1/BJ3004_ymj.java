import java.util.Scanner;
public class Week3_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cut = s.nextInt();
		
		cut = (cut % 2 == 1) ? (cut / 2 + 2) * (cut / 2 + 1) : (cut / 2 + 1) * (cut / 2 + 1);
        /*
        0번 1 * 1 = 1 한번도 안 잘랐을 경우 1 조각.
        1번 2 * 1 = 2 1번 자를 때 좌 항 증가.
        2번 2 * 2 = 4 2번 자를 때 우 항 증가.
        3번 3 * 2 = 6 3번 자를 때 좌 항 증가.
        4번 3 * 3 = 9 4번 자를 때 다시 우 항 증가.

        홀수 번 일때 좌 항이, 짝수 번 일때 우 항이 증가하는 규칙이 있음.
        3번 기준 : 1번, 3번에서 좌 항 증가 / 2번에서 우 항 증가
        4번 기준 : 1번, 3번에서 좌 항 증가 / 2번, 4번에서 우 항 증가

        0번인 1을 기반으로 n/2번 만큼 좌우 항이 증가하고, 홀수번일 경우 좌항이 한번 더 증가함.
        공식화 하면
        짝수n = (n/2+1)^2
        홀수n = (n/2+2) * (n/2+1)

        삼항연산자로 코드를 간결화 하면 위 처럼 됨.
        */
		System.out.println(cut);
	}
}