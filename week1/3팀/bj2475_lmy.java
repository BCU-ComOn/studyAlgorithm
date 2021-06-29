package week1;

import java.util.*;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int sum = 0;
	        for(int i=0;i<5;i++)
	        {
	        	int num = in.nextInt();
	        	sum += num*num;
	        }
	        in.close();
	        System.out.print(sum%10);
	    }

	}

