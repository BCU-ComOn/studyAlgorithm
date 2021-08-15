import java.util.Scanner;

public class bj2566_hcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[][] =new int[9][9];
		int max=0;
		int hang = 0,yeol = 0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				num[i][j]=sc.nextInt();
				if(max<num[i][j]) {
				   max=num[i][j];
				   hang=i+1; yeol=j+1;
				}
			}
		}
       System.out.print(max+"\n"+hang+" "+ yeol);
	}

}