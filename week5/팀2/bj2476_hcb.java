import java.util.Scanner;

public class bj2476_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peo=sc.nextInt();
		int num[] = new int[peo];
		int sum[] = new int [peo];
		int max=0,max1=0;
		for(int i=0; i<peo; i++) {
			for(int j=0; j<3; j++) {
				num[j]=sc.nextInt();
				if(max<num[j]) max=num[j];
								
			}
	           if(num[0]==num[1]&&num[1]==num[2]&&num[0]==num[2]) sum[i]=num[0]*1000+10000;
	           else if(num[0]!=num[1]&&num[1]!=num[2]&&num[0]!=num[2]) sum[i]=max*100;
	           else sum[i]=num[0]*100+1000;
		}
		for(int i=0; i<peo; i++) {
		  if(sum[i]>max1) max1=sum[i];
 		}
		System.out.println(max1);
	}

}