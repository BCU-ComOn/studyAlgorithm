N=int(input())
for i in range(N):
    sentence= input().split(' ')#공백 구분해 단어 리스트에 저장
    result = sentence[2:] + sentence[0:2]#앞의 두단어를 맨 뒤에 붙임
    print(' '.join(result))#변수 값 중간에 공백을 넣어 문자열 형식으로 출력

"""
자바로 풀어 봤는데 컴파일 에러가 뜸.. 어디서 잘못 된것일까..
import java.util.Scanner;
public class BJ5363_ayj {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int space=0;
		for(int i=0;i<n;i++) {
			String a=s.nextLine();
			for(int j=0;j<a.length();j++) {
				char tmp = a.charAt(i);
				if(tmp ==' ') space++; 
			}
			int[] arr= new int[space+1];
			int tmp=arr[space-1];
			int tmpp=arr[space];
			for(int k=space-1;k>=1;k--) {
				arr[k]=arr[k-2];
			}
			arr[0]=tmp;
			arr[1]=tmpp;
			System.out.println(arr);
		}
		
	}

}
"""