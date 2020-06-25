package com.fengtian.qianer.atcoder.abc.abc105;

import java.util.Scanner;

public class ABC105_B {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        for (int i = 0; i <= n; i += 4) {
            for (int j = 0; j <= n; j += 7) {
                if (i + j == n) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}
