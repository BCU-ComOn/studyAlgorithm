package week5.팀1;

import java.util.Scanner;

public class BJ4153_ayj {

	public static void main(String[] args) {
		// 직각=right 그외=wrong
		Scanner s = new Scanner(System.in);
		/*
		 * int i =1; int[][] arr= new int[i][3]; int max=0; while(true){ for(int j
		 * =0;j<3;j++) { arr[i][j]=s.nextInt();
		 * if(arr[i][0]==0&&arr[i][1]==0&&arr[i][2]==0) { break; } int n=
		 * Math.max(arr[i][0],arr[i][1]); max=n; if(n<arr[i][2]) { max=arr[i][2];
		 * if(max*max==Math.pow(arr[i][0],2)+Math.pow(arr[i][1],2)) {
		 * System.out.println("right"); } else { System.out.println("wrong"); } } } i++;
		 * }
		 */
		// 너무 복잡하게 생각한거같다... 입력하고 바로 답나오는거 말고 한꺼번에 입력하고 000입력하면
		// 나오려면 어떻게 하지 생각하다가 위에처럼 난리남..

		while (true) {

			int x = s.nextInt();
			int y = s.nextInt();
			int z = s.nextInt();

			// 0 0 0 을 입력받으면 종료
			if (x == 0 && y == 0 && z == 0)
				break;

			if ((x * x + y * y) == z * z) {
				System.out.println("right");
			} else if (x * x == (y * y + z * z)) {
				System.out.println("right");
			} else if (y * y == (z * z + x * x)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}