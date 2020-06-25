package com.fengtian.qianer.atcoder.abc.abc144;

import java.util.Scanner;

public class ABC144_C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();

        long ans = Long.MAX_VALUE;
        for (long i = 1; i <= Math.sqrt(N); i++) {
            if (i * (N / i) == N) {
                ans = Math.min(ans, i + N / i - 2);
            }
        }

        System.out.println(ans);
    }
}
