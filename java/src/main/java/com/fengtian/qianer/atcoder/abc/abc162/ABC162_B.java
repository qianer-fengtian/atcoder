package com.fengtian.qianer.atcoder.abc.abc162;

import java.util.Scanner;

public class ABC162_B {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        long ans = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) ans += i;
        }

        System.out.println(ans);
    }
}
