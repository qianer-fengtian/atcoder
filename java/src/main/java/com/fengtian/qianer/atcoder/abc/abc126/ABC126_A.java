package com.fengtian.qianer.atcoder.abc.abc126;

import java.util.Scanner;

public class ABC126_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int K = sc.nextInt();
        final String S = sc.next();

        System.out.println(S.substring(0, K-1) + String.valueOf(S.charAt(K-1)).toLowerCase() + S.substring(K));
    }
}
