import java.util.Scanner;
public class BJ5532_ymj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++) {
			num[i] = s.nextInt();
		}
		
		if(num[1]%num[3] == 0) num[1] = num[1]/num[3];
		else num[1] = num[1] / num[3] + 1;
		
		if(num[2]%num[4] == 0) num[2] = num[2]/num[4];
		else num[2] = num[2] / num[4] + 1;
		
		if(num[1]<num[2]) num[1] = num[2];
		
		num[0] -= num[1];
		
		System.out.println(num[0]);
	}

}
