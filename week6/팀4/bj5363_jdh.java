package week6.팀4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj5363_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < N; i++) {
			String word = in.readLine();
			int sub = word.indexOf(" ", word.indexOf(" ") + 1);
			String temp1 = word.substring(0, sub);
			String temp2 = word.substring(sub + 1, word.length());
			
			out.write(temp2 + " " + temp1 + "\n");
		}
		
		in.close();
		out.close();
	}

}
