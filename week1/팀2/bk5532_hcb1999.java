package week1.팀2;

import java.util.Scanner;
public class bk5532_hcb1999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int l,a,b,c,d;
        l = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt(); 
        c = sc.nextInt();
        d = sc.nextInt();
        if(a%c == 0) a=a/c;
		else a=a/c+1;
        
        if(b%d == 0) b=b/d;
		else b=b/d+1;
        
        if(a<b) a=b;
        l-=a;
        
        System.out.println(l);
	}

}