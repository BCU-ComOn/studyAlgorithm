    import java.util.*;
    public class bj2476_lmy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] dice = new int[num][3];
		int[] sum = new int[num];
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<3;j++)
			{
				dice[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for(int i=0;i<num;i++)
		{
			if(dice[i][0] == dice[i][1] && dice[i][0] == dice[i][2] && dice[i][1] == dice[i][2])
				sum[i] = 10000 + (dice[i][0]*1000);
			else if(dice[i][0] == dice[i][1] || dice[i][0] == dice[i][2] || dice[i][1] == dice[i][2])
				sum[i] = 1000 + 100 * (dice[i][0]==dice[i][1]?dice[i][0]:dice[i][2]);
			else {
				if(dice[i][0] > dice[i][1] && dice[i][0] > dice[i][2])
					sum[i] = dice[i][0] * 100;
				else if(dice[i][1] > dice[i][0] && dice[i][1] > dice[i][2])
					sum[i] = dice[i][1] * 100;
				else
					sum[i] = dice[i][2] * 100;
			}
		}
		Arrays.sort(sum);
		System.out.print(sum[sum.length - 1]+ " ");
		
	}
}
