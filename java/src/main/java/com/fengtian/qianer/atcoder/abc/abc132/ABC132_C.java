package com.fengtian.qianer.atcoder.abc.abc132;

import java.util.Arrays;
import java.util.Scanner;

public class ABC132_C {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        Arrays.sort(d);

        System.out.println(d[n/2] - d[n/2-1]);
    }
}
