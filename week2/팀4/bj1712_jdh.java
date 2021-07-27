package week2.팀4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj1712_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String bufferArr[] = in.readLine().split(" ");
		int arr[] = new int[bufferArr.length];
		for (int i = 0; i < bufferArr.length; i++) arr[i] = Integer.parseInt(bufferArr[i]);
		
		int count = 0;
		if (arr[2] <= arr[1]) count = -1;
		else count = (arr[0] / (arr[2] - arr[1])) + 1;
		
		out.write(String.valueOf(count));
		out.close();
	}
}
