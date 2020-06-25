package com.fengtian.qianer.atcoder.abc.abc003;

import java.util.Arrays;
import java.util.Scanner;

public class ABC003_C {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int K = sc.nextInt();

        final int[] R = new int[N];
        for (int i = 0; i < N; i++) {
            R[i] = sc.nextInt();
        }

        double C = 0.0;

        Arrays.sort(R);

        for (int i = N-K; i < N; i++) {
            C = (C+R[i])/2;
        }

        System.out.println(C);
    }
}
