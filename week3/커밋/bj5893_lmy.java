package week3.커밋;

import java.util.*;
import java.io.*;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean ones[] = new boolean[str.length() + 50];
        for (int i = 0; i < str.length(); i++) {
            ones[ones.length - 5 - i] = str.charAt(str.length() - 1 - i) == '1';
        }
        for (int i = 0; i < str.length(); i++) {
            if (ones[ones.length - 1 - i] && str.charAt(str.length() - 1 - i) == '1') {
                int j = ones.length - 1 - i;
                while (ones[j]) {
                    ones[j] = false;
                    j--;
                }
                ones[j] = true;
            } else
                ones[ones.length - 1 - i] = str.charAt(str.length() - 1 - i) == '1';
        }
        boolean first = false;
        for (int i = 0; i < ones.length; i++) {
            if (!first && !ones[i])
                continue;
            first = true;
            bw.write(ones[i] ? '1' : '0');
        }
        if (!first)
            bw.write('0');
        bw.flush();
    }
}
