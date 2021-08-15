import java.util.Scanner;

public class bj5363_hcb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();		
        String s = in.nextLine();
        String[] arr = s.split(" ");
        for(int i=0; i<num; i++) {
        	s = in.nextLine();
        	arr = s.split(" ");   	 
		for (int j = 0; j <arr.length-2; j++) {
			
			System.out.print(arr[j+2]+" ");
			

		}
		System.out.print(arr[0]+" ");
		System.out.print(arr[1]+"\n");
        }
	}

}