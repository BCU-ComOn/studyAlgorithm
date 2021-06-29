import java.util.*;

public class Main {

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
