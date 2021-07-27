package week1.팀4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj10156_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String buffer_string[] = in.readLine().split(" ");

		int arr[] = new int[3];
		for (int i = 0; i < buffer_string.length; i++)
			arr[i] = Integer.parseInt(buffer_string[i]);

		if ((arr[0] * arr[1]) > arr[2])
			out.write(String.valueOf((arr[0] * arr[1]) - arr[2]));
		else
			out.write(String.valueOf(0));

		out.close();
	}

}
