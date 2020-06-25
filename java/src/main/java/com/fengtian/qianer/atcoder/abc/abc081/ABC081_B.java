package com.fengtian.qianer.atcoder.abc.abc081;

import java.util.Scanner;

public class ABC081_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 != 0) break;
            A[i] /= 2;
            if (i == N-1) {
                ans++;
                i = 0;
            }
        }
        System.out.println(ans);
    }
}
