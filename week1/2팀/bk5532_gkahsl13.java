import java.util.Scanner;
public class bk5532_gkahsl13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int []num = new int[5];
		
		for(int i=0;i<5;i++) {
			num[i]=in.nextInt();
			}
		if(num[1]%num[3] == 0) num[1]=num[1]/num[3];
		else num[1]=num[1]/num[3]+1;
		
		if(num[2]%num[4] == 0) num[2]=num[2]/num[4];
		else num[2]=num[2]/num[4]+1;
	
		if(num[1]<num[2]) num[1]=num[2];
		
		num[0]-=num[1];
		
		System.out.println(num[0]);
	}

}
