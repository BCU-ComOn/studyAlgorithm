import java.util.Scanner;
public class BJ10173_ayj {
	//nosuchelement
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input="";
		while(true){
			input = s.nextLine().trim();
            //nextLine()이 while문처럼 끝이 안보일 때는 nosuchelement
            //경고가 뜬다... 그래서 trim()붙임
			if(input.contains("EOI")) break;
			if((input.toUpperCase().contains("Nemo".toUpperCase()))==true) {
				System.out.println("Found");
			}
			else if((input.toUpperCase().contains("Nemo".toUpperCase()))==false) {
				System.out.println("Missing");
			}
		}
	}

}