package com.fengtian.qianer.atcoder.abc.abc146;

import java.util.Scanner;

public class ABC146_C {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long a = sc.nextLong();
        final long b = sc.nextLong();
        final long x = sc.nextLong();
        final long max = 1000000000L;

        if (a*max+b*d(max) <= x) {
            System.out.println(max);
            return;
        }

        long ans = 0;
        long left = 0;
        long right = max;
        while (left < right) {
            final long mid = (left + right) / 2;
            if (x < a*mid+b*d(mid)) {
                right = mid;
            } else {
                ans = Math.max(ans, mid);
                left = mid + 1;
            }
        }

        System.out.println(ans);
    }


    private static long d(long n) {
        return String.valueOf(n).length();
    }
}
