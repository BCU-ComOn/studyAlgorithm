package week7.커밋;

// 니모를 찾아서
import java.util.Scanner;

public class bj10173_cjy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			String st = s.nextLine();
			String str = st.replace(",", "");
			String result = "Missing";
			if (str.equals("EOI"))
				break;

			String[] array = str.split(" ");
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase("Nemo")) {
					result = "Found";
				}
			}
			System.out.println(result);
		}
	}
}
