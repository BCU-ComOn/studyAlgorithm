import java.util.Scanner;
public class BJ1085_ymj {
	//4주차 3번

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[4];
		
		for(int i=0; i<num.length; i++) {
			num[i] = s.nextInt();
		}
		
		for(int i=0; i<2; i++) { //직사각형의 각 x,y 좌표와 현좌표의 각 x,y 차이의 절대값
			if(num[i] > num[i+2]) num[i+2] = num[i] - num[i+2]; //항상 양수를 만들어내기 위해 큰값에서 작은값을 뺌
			else num[i+2] = num[i+2] - num[i];
		}
		
		for(int i=0; i<4; i++) { // 0,0에 가까울 수도 있으므로 x,y 좌표와 (직사각형 - x,y 좌표들)의 비교
			if(num[i] < num[0]) num[0] = num[i]; 
		}
		
		System.out.println(num[0]); //가장 작은 값이 가장 가까운 거리이므로 출력
	}
}
