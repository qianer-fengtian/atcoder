package com.fengtian.qianer.atcoder.abc.abc081;

import java.util.Scanner;

public class ABC081_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int ans = 0;
        for (char c : s.toCharArray()) if (c == '1') ans++;
        System.out.println(ans);
    }
}
