/*
�������ڴ� ��Ʈ���� �����ϰ� �Ǹ��ϴ� ȸ���̴�.
��Ʈ�� �Ǹ� ����� ������� �ų� �Ӵ��, ��꼼, �����, �޿� ��
A������ ���� ����� ���, 
�� ���� ��Ʈ���� �����ϴ� ������ ����� �ΰǺ� �� �� B������ ���� ����� ��ٰ� �Ѵ�.

���� ��� A=1,000, B=70�̶�� ����.
�� ��� ��Ʈ���� �� �� �����ϴ� ���� �� 1,070������ ���,
�� �� �����ϴ� ���� �� 1,700������ ���.

��Ʈ�� ������ C�������� å���Ǿ��ٰ� �Ѵ�. 
�Ϲ������� ���� ����� �÷� ���� ���� ��� ���� �� ����(�Ǹź��)�� 
�� ���(=�������+�������)���� �������� �ȴ�.
���ʷ� �� ������ �� ��뺸�� ������ ������ �߻��ϴ� ������
���ͺб���(BREAK-EVEN POINT)�̶�� �Ѵ�.

A, B, C�� �־����� ��, ���ͺб����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

/*
 * 1000 70 170 	11
 * */

package week2.팀4;

import java.util.Scanner;

public class bj1712_ckh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B, C, D = 0;

		Scanner scan = new Scanner(System.in);

		/*
		 * �Һ� ���� ��Ʈ�� 1000 70 170 = 11
		 */

		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();

		if (C <= B) {
			System.out.println("-1");
		} else {
			System.out.println((A / (C - B)) + 1);

		}
	}
}

