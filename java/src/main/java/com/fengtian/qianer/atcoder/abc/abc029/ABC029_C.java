package com.fengtian.qianer.atcoder.abc.abc029;

import java.util.Scanner;

public class ABC029_C {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final String[] abc = new String[]{"a", "b", "c"};

        for (int i = 0; i < Math.pow(3, N); i++) {
            String s = "000000000" + Integer.toString(i, 3);
            s = s.substring(s.length() - N);
            for (char c : s.toCharArray()) {
                final int n = Character.getNumericValue((c));
                System.out.print(abc[n]);
            }
            System.out.println();
        }
    }
}
