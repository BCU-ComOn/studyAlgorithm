package week3.커밋;

import java.util.*;
import java.io.*;

public class bj4880_lmy {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str1[] = br.readLine().split(" ");
            int a = Integer.parseInt(str1[0]);
            int b = Integer.parseInt(str1[1]);
            int c = Integer.parseInt(str1[2]);
            if ((a | b | c) == 0) break;
            if (b - a == c - b) bw.write("AP " + (c + (c - b)));
            else bw.write("GP " + (c * (c / b)));
            bw.write("\n");
        }
        bw.flush();
    }
}

