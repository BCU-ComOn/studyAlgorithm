import java.util.*;
public class BJ2476_ayj {
//
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int[] price=new int[n];//[]안에 3을 써서 런타임 에러 났다.. n으로 바꿔줌!
		for(int i=0;i<n;i++) {
			int first=s.nextInt();
			int second=s.nextInt();
			int thrid=s.nextInt();
			int max=first;

			if(first==second&&second==thrid&&first==thrid) {//같은 수일 때
				price[i]=10000+first*1000;
			}
			else if((first==second&&first!=thrid)||
					(first==thrid&&first!=second)||
					(second==thrid&&second!=first)) {//두개만 같은 수일 때
				if(first==second) {
					price[i]=1000+first*100;
				}
				else if(first==thrid) {
					price[i]=1000+first*100;
				}
				else if(second==thrid) {
					price[i]=1000+second*100;
				}
			}
			else if(first!=second&&second!=thrid&&first!=thrid) {//다 다른 수일 때
				if(max<second) max=second;
				if(max<thrid) max=thrid;
				price[i]=max*100;
			}
		}
		Arrays.sort(price);//작은수-큰수 순서대로 정렬
		System.out.println(price[price.length-1]);//맨 마지막 수가 큰수 이므로
		
	}

}
