package week5.팀4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj2953_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int maxscore = 0;
		int number = 0;
		
		for (int i = 0; i < 5; i++) {
			String array[] = in.readLine().split(" ");
			int score = 0;
			
			for (int k = 0; k < array.length; k++) {
				score += Integer.parseInt(array[k]);
			}
			
			if (maxscore < score) {
				maxscore = score;
				number = i + 1;
			}
		}
		
		in.close();
		
		out.write(String.valueOf(number) + " " + String.valueOf(maxscore));
		
		out.close();
	}

}
