package week5.팀2;

import java.util.Scanner;

public class bj2953_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num[][] =new int[5][4];
        int sum[]= new int[5];
        int i;
        int s=0;
        int max=0;
    for(i=0; i<5; i++) {    
        for(int j=0; j<4; j++) {
        	num[i][j]=sc.nextInt(); 
        	sum[i]+=num[i][j];
        }
    	
    		   
       }
    for(int b=0;b<5;b++) {
    	if(max<sum[b]) { 
    		 max =sum[b];
    	     s=b+1;
    	}
       	
       	
    }
    
    System.out.println(s+" "+max);
   
	}

}