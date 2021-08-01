package week3.팀2;

import java.util.Scanner;

public class bk2774_hcb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int num= in.nextInt();
		int[]c=new int[num];
   
		for(int a=0; a<num; a++) {
        	 int b= in.nextInt();
        	 boolean[] arr = new boolean[10];
        	 while(b!=0) {
        		 arr[(int) (b % 10)] = true;
        		 b/=10;        		 
         	 }
        	 for(int j=0; j<10; j++) {
 		    	if(arr[j]==true) {
 		    		c[a]=c[a]+1;  // 
 		    	}
         }
        
	}
		for (int z=0; z<num; z++) {
			System.out.println(c[z]);
		}

}
}