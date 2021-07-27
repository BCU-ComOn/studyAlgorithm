import java.util.*;

public class bj2774_lmy { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String strs = scan.next();
		
		String s = "";
		for (int i=0; i<strs.length(); i++) {
			char ch = strs.charAt(i);
			
			if (ch >= 65 && ch <= 90) {
				s += (char)(ch+32);
			}else if (ch >= 97 && ch <= 122) {
				s += (char)(ch-32);
			}
		}
		
		System.out.println(s);
	}

}



    

