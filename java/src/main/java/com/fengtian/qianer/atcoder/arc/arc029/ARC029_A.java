package com.fengtian.qianer.atcoder.arc.arc029;

import java.util.Scanner;

public class ARC029_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] t = new int[N];

        for (int i = 0; i < N; i++) {
            t[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for (int bit = 0; bit < (1<<N); bit++) {
            final int[] meatMaker = new int[2];
            for (int j = 0; j < N; j++) {
                meatMaker[(bit >> j) & 1] += t[j];
            }
            ans = Math.min(ans, Math.max(meatMaker[0], meatMaker[1]));
        }

        System.out.println(ans);
    }
}
