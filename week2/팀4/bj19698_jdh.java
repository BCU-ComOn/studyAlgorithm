import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj19698_jdh {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String bufferArr[] = in.readLine().split(" ");
		int arr[] = new int[bufferArr.length];
		for (int i = 0; i < bufferArr.length; i++) arr[i] = Integer.parseInt(bufferArr[i]);
		
		int count = (arr[1] / arr[3]) * (arr[2] / arr[3]);
		if (arr[0] < count) out.write(String.valueOf(arr[0]));
		else out.write(String.valueOf(count));
		
		out.close();
	}
}
