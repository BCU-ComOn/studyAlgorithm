package week2.커밋;

import java.util.Scanner;

public class bj1712_lmy {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); // 고정비용(임대료)
        int B = in.nextInt(); // 가변비용(생산비용)
        int C = in.nextInt(); // 상품가격(판매비용)

        if (B >= C) { // 생산비용이 판매비용보다 큰 경우(비정상)
            System.out.println("-1");
        } else { // 손익분기점 계산(순이익 = 판매비용-생산비용, 고정비용/순이익+1 = 이득이 되는 시점 = 손익분기점)
            System.out.println((A / (C - B)) + 1);
        }
    }
}
