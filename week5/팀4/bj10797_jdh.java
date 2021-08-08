package week5.팀4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj10797_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String date = in.readLine();
		String number[] = in.readLine().split(" ");
		int count = 0;
		
		in.close();
		
		for (int i = 0; i < number.length; i++) {
			if (date.equals(number[i])) count++;
		}
		
		out.write(String.valueOf(count));
		
		out.close();
	}

}
