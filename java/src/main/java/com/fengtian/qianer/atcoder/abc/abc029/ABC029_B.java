package com.fengtian.qianer.atcoder.abc.abc029;

import java.util.Scanner;

public class ABC029_B {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int ans = 0;

        for (int i = 0; i < 12; i++) {
            final String s = sc.next();
            if (s.contains("r")) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
