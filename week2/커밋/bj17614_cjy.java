package week2.커밋;
// 369
import java.util.Scanner;

public class bj17614_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int num = s.nextInt();
		int count = 0;
		char ch;
		for (int i=1; i<=num; i++) {
			String st = String.valueOf(i);
			
			for (int j=0; j<st.length(); j++) {
				ch = st.charAt(j);
				if(ch == '3' || ch == '6' || ch == '9') {
					count++;
				}
			}
		}
		System.out.println(count);	
	
		//서브태스크 5번 시간초과
		/*
		Scanner s = new Scanner (System.in);
		int num = s.nextInt();
		int count = 0;
		String[] array;
		
		for (int i=1; i<=num; i++) {
			array = String.valueOf(i).split("");
			for(int j=0; j<array.length; j++) {
				if(array[j].equals("3") || array[j].equals("6")|| array[j].equals("9")) {
					count++;
				}
			}
		}
		System.out.println(count);*/
	}
}
