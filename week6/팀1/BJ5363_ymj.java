package week6.팀1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class BJ5363_ymj {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(bf.readLine()); // 문장 수
		String sentence;
		
		for(int i=0; i<num; i++) { //문장 수 만큼 반복
			sentence = bf.readLine(); // 문장 입력 받음
			int max = sentence.indexOf(" ", sentence.indexOf(" ") + 1); //문장의 두번째 공백 번호
			String first = sentence.substring(max + 1, sentence.length()); //두번째 공백 이후 부터 끝가지 파싱
			String last = sentence.substring(0, max); //처음 부터 그 공백까지 파싱
			bw.write(first + " " + last + "\n"); // 요다어 출력
		}
		bf.close();
		bw.close();
	}
}