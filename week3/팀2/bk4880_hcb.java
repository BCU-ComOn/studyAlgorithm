package week3.팀2;

import java.util.Scanner;

public class bk4880_hcb {

	public static void main(String[] args) {
	   int a[] = new int[3];	  
	   Scanner sc = new Scanner(System.in);
	   while(true) {
	   for(int i=0; i<3; i++) {
	       a[i]= sc.nextInt();
	      	       
	}
	   if(a[0]==a[1]&&a[1]==a[2]) break; 
	   if((a[1]-a[0])==(a[2]-a[1])) System.out.println("AP "+ (a[2]+a[2]-a[1]));
       else if((a[1]/a[0])==(a[2]/a[1])) System.out.println("GP "+ (a[2]*(a[2]/a[1])));
	   
	   }
	  
	    
	   
	}
}