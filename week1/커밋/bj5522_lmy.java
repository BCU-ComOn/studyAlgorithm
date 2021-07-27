package week1.커밋;

import java.util.*;

public class bj5522_lmy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner in = new Scanner(System.in);
		        int sum = 0;
		        for(int i=0;i<5;i++)
		        {
		        	int num = in.nextInt();
		        	sum += num;
		        }
		        in.close();
		        System.out.print(sum);
		    }
	}
