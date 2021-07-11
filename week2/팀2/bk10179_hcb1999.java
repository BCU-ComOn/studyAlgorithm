import java.util.Scanner;

public class bk10179_hcb1999 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int test=sc.nextInt();
	     double num[]= new double[3];
	     double result[] = new double[3];
	     
	     for(int i=0; i<test; i++){
	    	 num[i]=sc.nextDouble();
	    	 result[i]=num[i]*0.8;	    		    	
	     }
	    for(int j=0; j<3;j++) {
	     System.out.printf("$%.2f\n",result[j]);
	    }
	    }

}
