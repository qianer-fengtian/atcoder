package com.fengtian.qianer.atcoder.abc.abc149;

import java.util.Scanner;

public class ABC149_B {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        long c = Math.max(0, k - a);

        System.out.println(Math.max(0, a - k) + " " + Math.max(0, b - c));
    }
}
