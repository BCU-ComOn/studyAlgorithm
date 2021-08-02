package week4.팀4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj1085_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String bufferArr[] = in.readLine().split(" ");
		int arr[] = new int[bufferArr.length];
		for (int i = 0; i < bufferArr.length; i++)
			arr[i] = Integer.parseInt(bufferArr[i]);

		arr[2] -= arr[0];
		arr[3] -= arr[1];

		int result = 1000;

		for (int i = 0; i < 4; i++) {
			if (arr[i] < result)
				result = arr[i];
		}

		out.write(String.valueOf(result));

		out.close();
	}

}
