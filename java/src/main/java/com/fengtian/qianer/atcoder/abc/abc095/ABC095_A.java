package com.fengtian.qianer.atcoder.abc.abc095;

import java.util.Scanner;

public class ABC095_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String s = sc.next();

        int ans = 700;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') ans += 100;
        }
        System.out.println(ans);
    }
}
