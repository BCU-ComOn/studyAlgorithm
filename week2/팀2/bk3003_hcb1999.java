import java.util.Scanner;

public class bk3003_hcb1999 {

	public static void main(String[] args) {
	     int arr[] = new int[6];
	     int check[] = {1,1,2,2,2,8};
         int result[]= new int[6];
         Scanner sc = new Scanner(System.in);
         for(int i=0; i<6; i++) {
        	 arr[i]=sc.nextInt();
        	 result[i]= check[i]-arr[i];
        	 
         }
         System.out.printf("%d %d %d %d %d %d",result[0],result[1],result[2]
        		 ,result[3],result[4],result[5]);
        
	}

}