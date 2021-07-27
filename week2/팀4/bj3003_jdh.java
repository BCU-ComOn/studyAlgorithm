package week2.팀4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj3003_jdh {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String bufferArr[] = in.readLine().split(" ");
		int arr[] = new int[bufferArr.length];
		for (int i = 0; i < bufferArr.length; i++) arr[i] = Integer.parseInt(bufferArr[i]);
		
		int temp[] = {1, 1, 2, 2, 2, 8};
		
		for (int i = 0; i < arr.length; i++) {
			out.write(String.valueOf(temp[i] - arr[i]));
			out.write(" ");
		}
		out.close();
	}
}
