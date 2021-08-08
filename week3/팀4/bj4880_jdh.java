package week3.팀4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj4880_jdh {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String bufferArr[] = in.readLine().split(" ");
			int arr[] = new int[bufferArr.length];
			for (int i = 0; i < bufferArr.length; i++) arr[i] = Integer.parseInt(bufferArr[i]);
			
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
			
			if (arr[2] - arr[1] == arr[1] - arr[0]) System.out.println("AP " + (arr[2] + (arr[2] - arr[1])));
			else System.out.println("GP " + (arr[2] * (arr[2] / arr[1])));
		}
	}
	
}
