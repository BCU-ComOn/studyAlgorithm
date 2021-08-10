package week6.팀1;
import java.util.Scanner;
public class BJ2476_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt(); // 사람 수
		int max = 0, Rmax = 0; // 주사위 최대값, 가장 큰 상금값
		int[] dice = new int[3]; //주사위 세개
		int reward = 0; //상금
		
		for(int i=0; i<num; i++) {
			max = 0;
			for(int j=0; j<dice.length; j++) {
				dice[j] = s.nextInt();
				if(max<dice[j]) max = dice[j]; //주사위 최대값
			}
			if(dice[0] == dice[1] && dice[0] == dice[2]) reward = 1000 * dice[0] + 10000;
            //세개의 주사위가 모두 같을 경우
			else if(dice[0] == dice[1] || dice[0] == dice[2]) reward = 100 * dice[0] + 1000;
            //2개만 같을 경우 1
			else if(dice[1] == dice[2]) reward = 100 * dice[1] + 1000;
            //2개만 같을 경우 2
			else reward = 100 * max;
            //그밖의 다 다를경우 최대 주사위 눈 * 100
			
			if(Rmax < reward) Rmax = reward;
            //최대 상금값
		}
		System.out.println(Rmax);
	}
}
