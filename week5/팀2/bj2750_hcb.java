import java.util.Scanner;

public class bj2750_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int seq[]=new int[num];
		int i=0,swap;
		while(i<num) {
			seq[i]=sc.nextInt();
			i++;						
		}
		for(int j=0; j<num; j++) {
			for(int u=j+1; u<num; u++) {
				if(seq[j]>seq[u]) {
				swap=seq[j];
				seq[j]=seq[u];
				seq[u]=swap;
				
				}
						
			}
		}
        for(i=0;i<num; i++) {
        	System.out.println(seq[i]);
        }
		
	}

}