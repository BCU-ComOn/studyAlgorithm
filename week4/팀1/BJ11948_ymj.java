import java.util.Scanner;
public class BJ11948_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] score = new int[6];
		int minmax = 100; //최대 최소값을 알아내기 위한 변수
		int sum = 0; //점수의 총합
		
		for(int i=0; i<6; i++) {
			score[i] = s.nextInt();
			if(i<4) {
				if(minmax > score[i]) minmax = score[i]; //0~4까지의 배열중 가장 작은값을 minmax 로 입력
				sum += score[i]; //0~4까지의 점수들을 일단 총합으로 더함.
			}
		}
		
		sum -= minmax; //가장 작은값을 뺌
		
		if(score[5] > score[4]) minmax = score[5]; //4, 5번 인덱스 중에 큰 값을 minmax 변수에 입력
		else minmax = score[4];
		
		sum += minmax; //그 값을 총합에 더함
		
		System.out.printf("%d", sum);
	}
}
