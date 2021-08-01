package week4.팀2;
import java.io.*;
import java.util.*;
public class bj1284_osm {
	public static void main(String[] args) {
		Scanner in = new 	Scanner(System.in);
		while(true){
			String a =in.next();
			int count =0;
			int a_lne=a.length();
			
			if(a.equals("0"))
				System.exit(0);
			for(int i=0;i<a.length();i++)
			{
				String b=a.substring(i,i+1);
				
				if(b.equals("1"))
					count+=3;
				else if(b.equals("0"))
					count+=5;
				else
					count+=4;
			}
			System.out.println(count+1);
			
		}
		
	}
}
