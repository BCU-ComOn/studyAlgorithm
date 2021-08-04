package week5.팀4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj4153_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			String array[] = in.readLine().split(" ");
			int line[] = new int[array.length];
			int maxnum = 0;
			
			for (int i = 0; i < array.length; i++) {
				line[i] = Integer.parseInt(array[i]);
				if (maxnum < line[i]) maxnum = line[i];
			}
			
			if (line[0] == 0) break;
			
			if (((line[0] * line[0]) + (line[1] * line[1]) + (line[2] * line[2])) / 2 == (maxnum * maxnum)) out.write("right\n");
			else out.write("wrong\n");
		}
		
		in.close();
		out.close();
	}

}
