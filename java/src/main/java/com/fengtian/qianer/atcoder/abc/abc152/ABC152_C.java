package com.fengtian.qianer.atcoder.abc.abc152;

import java.util.Scanner;

public class ABC152_C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        int min = P[0];

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (P[i] <= min) {
                ans++;
            }
            min = Math.min(min, P[i]);
        }

        System.out.println(ans);
    }
}
