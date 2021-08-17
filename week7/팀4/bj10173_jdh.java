package week7.팀4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj10173_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			String wordline = in.readLine();
			
			if (wordline.equals("EOI")) break;
			
			if (wordline.toUpperCase().contains("NEMO")) out.write("Found\n");
			else out.write("Missing\n");
		}
		
		in.close();
		out.close();
	}

}
