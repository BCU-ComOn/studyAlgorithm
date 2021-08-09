package week5.팀2;

import java.util.Scanner;

public class bj2953_cbj {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		int a[] = new int[4]; // 선수당 4개씩받으니까
		int sum[] = new int[5]; // sum[0]부터 [4] 까지 입력받기
		
		for(int x=0; x<5; x++) {
			for(int y=0; y<4; y++) {
				a[y] = in.nextInt();  // 선수당 4개받은걸
				sum[x] = sum[x] + a[y]; // sum [x]에 차곡차곡 저장.
			}
			

		}
		
		int max=0; 
		int index =0; // index 변수 선언.
		for (int z=0; z<5; z++) {
			if(max<sum[z]) { 
				max= sum[z];  
				index =z + 1;
			}
			
		}
		System.out.println(index+" "+max);
	}

}
