package com.fengtian.qianer.atcoder.abc.abc151;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC151_B {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int k = sc.nextInt();
        final int m = sc.nextInt();

        final int[] a = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            a[i] = sc.nextInt();
        }

        final int x = n * m - IntStream.of(a).sum();
        if (x > k) {
            System.out.println(-1);
        } else if (x < 0) {
            System.out.println(0);
        } else {
            System.out.println(x);
        }
    }
}
