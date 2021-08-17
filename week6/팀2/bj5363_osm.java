package week6.팀2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj5363_osm {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < N; i++) {
			String line = in.readLine();
			int sub = line.indexOf(" ", line.indexOf(" ") + 1);
			String word1 = line.substring(0, sub);
			String word2 = line.substring(sub + 1, line.length());
			
			out.write(word2 + " " + word1 + "\n");
		}
		in.close();
		out.close();
	}

}


	