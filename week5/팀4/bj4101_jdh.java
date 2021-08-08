package week5.팀4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj4101_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			String array[] = in.readLine().split(" ");
			int num[] = new int[array.length];
		
			for (int i = 0; i < array.length; i++) {
				num[i] = Integer.parseInt(array[i]);
			}
			
			if (num[0] == 0 && num[1] == 0) break;
			
			if (num[0] > num[1]) out.write("Yes\n");
			else out.write("No\n");
		}
		
		in.close();
		out.close();
	}

}
