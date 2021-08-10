package week6.팀4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj2476_jdh {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(in.readLine());
		int max = 0;
		int flag = 4;
		
		for (int i = 0; i < N; i++) {
			String array[] = in.readLine().split(" ");
			int number[] = new int[3];
			int temp = 0;
			
			for (int k = 0; k < array.length; k++) number[k] = Integer.parseInt(array[k]);
			
			if (number[0] == number[1] && number[1] == number[2]) {
				flag = 1;
				temp = 10000 + (number[0] * 1000);
			}
			else if (flag > 1 && number[0] == number[1] || number[1] == number[2]) {
				flag = 2;
				temp = 1000 + (number[1] * 100);
			}
			else if (flag > 1 && number[0] == number[2]) {
				flag = 2;
				temp = 1000 + (number[0] * 100);
			}
			else if (flag > 2) {
				flag = 3;
				if (number[0] > number[1] && number[0] > number[2]) temp = number[0] * 100;
				else if (number[1] > number[2]) temp = number[1] * 100;
				else temp = number[2] * 100;
			}
			if (temp > max) max = temp;
		}
		
		in.close();
		
		out.write(String.valueOf(max));
		
		out.close();
	}

}
