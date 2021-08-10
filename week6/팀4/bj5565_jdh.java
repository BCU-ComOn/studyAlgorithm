package week6.팀4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj5565_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int all = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < 9; i++) all -= Integer.parseInt(in.readLine());
		
		in.close();
		
		out.write(String.valueOf(all));
		
		out.close();
	}

}
