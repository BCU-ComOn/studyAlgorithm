// 직사각형에서 탈출

import java.util.Scanner;

public class bj1085_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int w = s.nextInt();
		int h = s.nextInt();
		
		int min = 1000;
		
		if(x<min)
			min = x;
		if(y<min)
			min = y;
		if(w-x<min)
			min = w-x;
		if(h-y<min)
			min = h-y;
		System.out.println(min);
	}
}
