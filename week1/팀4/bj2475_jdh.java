package week1.팀4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj2475_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int total = 0;
		String arrnum[] = in.readLine().split(" ");

		for (int i = 0; i < arrnum.length; i++) {
			int num = Integer.parseInt(arrnum[i]);
			total += num * num;
		}
		total %= 10;

		out.write(String.valueOf(total));
		out.close();
	}

}
