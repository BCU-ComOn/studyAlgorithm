package week7.팀4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj2010_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(in.readLine());
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			int M = Integer.parseInt(in.readLine());
			result += M - 1;
		}
		
		result++;
		
		out.write(String.valueOf(result));
		
		in.close();
		out.close();
	}

}