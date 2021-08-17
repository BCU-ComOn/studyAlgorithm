package week7.팀2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class bj10173_osm {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in)); //입력스트림 선언
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out)); //출력스트림 선언
		while(true) {
			String line = r.readLine(); //버퍼로 입력받기
			if(line.equals("EOI")) //EOI일시 종료
				break;
			if(line.contains("Nemo"))  //앞이 대문자 N인 Nemo을 찾을떄
				w.write("Found\n");
			else if(line.contains("nemo")) //앞이 소문자인 nemo찾을떄
				w.write("Found\n");
			else
				w.write("Missing\n"); //못찾으면 missing 출력
		}
		r.close();  //입력스트림 닫기
		w.close(); //출력스트림 닫기
	}
}
