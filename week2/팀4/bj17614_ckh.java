
/*
 * �μ��� ���� �� ģ����� 369������ �ϰ� �ִ�.
 *  369������ ���� ���� �������� �ѷ� �ɾ� ���� ��ġ�� �����
 *   1�� ��ġ�� ���۵ȴ�. 
 *   ���� �ð�������� ���ư���
 *    2, 3, 4�� ���� 1�� ������ ���� �ڱ� ���� �ȴ�.
 *     ������� ���ƿ��� �ڱ� ���� 3, 6, Ȥ��
 *      9�� ���ԵǾ� ���� �ʴٸ� �� ���� ���ؾ� �ϸ�,
 *       3, 6, Ȥ�� 9�� ���ԵǾ� ������ �� ������ŭ
 *        �ڼ��� �ľ� �Ѵ�. �� ��Ģ�� ��Ű�� ���ϸ� ������
 *         ����ȴ�.

�μ��� 369������ 
N���� ��Ģ�� ��Ű�� ����ȴٸ� �׶������� ���� 
�ڼ��� Ƚ�� �� �� �� ������ �ñ��ߴ�.
 ���� ��� N = 14���, 3, 6, 9, 13���� 
 ���� �� ���� �� ���� ġ�� �ǹǷ� �� 4ȸ�� 
 �ڼ��� ��� �� ���̴�.
  N = 36�̶��
   3, 6, 9, 13, 16. 19. 23. 26. 29.   30. 31. 32. 33. 34. 35, 36����
  �ڼ��� ġ�� �Ǵµ� 33, 36������ �� �� �� �� �ڼ���
   �ľ� �ϹǷ� �� 18ȸ�� �ȴ�. 1 �̻��� ���� N�� ���Ͽ�
  369������ N���� ��Ģ�� ��Ű�� ����ȴٸ� �׶����� ���
    �Ǵ� �ڼ��� �� Ƚ���� ����Ͽ� ����ϴ� ���α׷���
      �ۼ��Ͻÿ�.
 */

package week2.팀4;

import java.util.Scanner;

public class bj17614_ckh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 0;
		int i = 1;
		int count = 0;

		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();

		while (i <= N) {
			String number = String.valueOf(i);
			char[] digits1 = number.toCharArray();

			for (int j = 0; j < digits1.length; j++) {
				if (digits1[j] == '3' || digits1[j] == '6' || digits1[j] == '9') {
					//System.out.println(digits1[j]);
				//	System.out.println("-------");
					count++;
				}
			}
			i++;
		}
		System.out.println(count);
	}

}
