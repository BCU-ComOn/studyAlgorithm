import java.util.Scanner;
public class BJ2010_ayj {
//n이 3이고 멀티탭을 모두 연결해 멀티탭이 각각 3 2 1 플러그를 갖을 때
	//최대 4개의 컴퓨터를 연결할 수 있음
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int sum=0;
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			int num=s.nextInt();
			sum+=num;
		}
		System.out.println(sum-(n-1));
	}

}
