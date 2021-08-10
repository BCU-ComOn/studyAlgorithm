package week3.커밋;
// 17배
import java.util.Scanner;

public class bj5893_cjy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String N = s.next(); //183
		int x =0; // 두 수 합
		int y =0; // 자리올림
		int z = N.length()-1; //인덱스
		N = "0000" + N;
		
		String[] array = N.split("");
		String[] plusarray = new String[array.length];
		String[] result = new String[N.length()];
		
		// 왼쪽 시프트 4 (*16)
		for(int i=0; i<array.length-4; i++) {
			plusarray[i] = array[i+4];
		}
		for(int i=1; i<=4; i++) {
			plusarray[plusarray.length-i] = "0";
		}
		
		// 왼쪽 시프트 4 (*16) + 원본(*1) = (*17)
        do{
        	int a =  Integer.parseInt(array[z]);
        	int p = Integer.parseInt(plusarray[z]);
        	
            x = a + p + y;
            String r =  Integer.toString(x);
            if(x<2){
                y=0;
                result[z] = r;
            }else{
                y = 1;
                String R = Integer.toString(x-2);
                result[z] = R;
            }
            z=z-1;    
        }while(z>=0);
        
		for(int i=1; i<=4; i++) {
			result[result.length-i] = array[array.length-i];
		}
		
		if(y == 1) 
			System.out.print(1);
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]);
		}
	}
}
