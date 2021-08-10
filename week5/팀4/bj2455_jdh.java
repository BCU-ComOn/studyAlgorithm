package week5.팀4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj2455_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		int maxnum = 0;
		
		for (int i = 0; i < 4; i++) {
			String array[] = in.readLine().split(" ");
			int pnum[] = new int[array.length];
			for (int k = 0; k < array.length; k++) {
				pnum[k] = Integer.parseInt(array[k]);
			}
			
			count -= pnum[0];
			count += pnum[1];
			
			if (maxnum < count) maxnum = count;
		}
		
		in.close();
		
		out.write(String.valueOf(maxnum));
		
		out.close();
	}

}