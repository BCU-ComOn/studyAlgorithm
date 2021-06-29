import java.util.Scanner;
public class a4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int lenH = s. nextInt();
		
		lenH = lenH / 5 + (lenH % 5 == 0 ? 0 : 1);

		System.out.println(lenH);
	}
}