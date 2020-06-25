package com.fengtian.qianer.atcoder.abc.abc167;

import java.util.Scanner;

public class ABC167_B {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long a = sc.nextLong();
        final long b = sc.nextLong();
        final long c = sc.nextLong();
        final long k = sc.nextLong();

        System.out.println(1 * Math.min(a, k) + -1 * Math.min(c, Math.max(0, k-a-b)));
    }
}
