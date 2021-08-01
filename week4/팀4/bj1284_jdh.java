import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj1284_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			String N = in.readLine();
			if (N.equals("0")) break;
			
			int result = 1;
			for (int i = 0; i < N.length(); i++) {
				if (N.charAt(i) == '0') result += 5;
				else if (N.charAt(i) == '1') result += 3;
				else result += 4;
			}
			
			out.write(String.valueOf(result) + "\n");
		}
		
		in.close();
		out.close();
	}

}
