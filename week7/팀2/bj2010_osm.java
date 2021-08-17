package week7.팀2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class bj2010_osm {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum=0;
		int count =Integer.parseInt(r.readLine());
		for(int i=0; i<count ;i++) {
			int num=Integer.parseInt(r.readLine());
			sum+=num;
		}
		w.write(String.valueOf(sum-(count-1)));
		r.close();
		w.close();
	}
}
