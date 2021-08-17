package week6.팀4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class bj2750_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(in.readLine());
		
		int numarray[] = new int[N];
		for (int i = 0; i < N; i++) numarray[i] = Integer.parseInt(in.readLine());
		
		in.close();
		Arrays.sort(numarray);
		
		for (int i = 0; i < N; i++) out.write(String.valueOf(numarray[i]) + "\n");
		
		out.close();
	}

}
