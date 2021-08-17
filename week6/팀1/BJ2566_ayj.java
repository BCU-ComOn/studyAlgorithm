import java.util.Scanner;
public class BJ2566_ayj {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][]= new int[9][9];
		int max=0;
		int maxx=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=s.nextInt();
				if(arr[max][maxx]<arr[i][j]) {
					max=i; maxx=j;				
					}
			}
		}
		System.out.println(arr[max][maxx]);
		System.out.println(max+1+" "+(maxx+1));
	}

}
