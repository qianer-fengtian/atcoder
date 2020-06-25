package com.fengtian.qianer.atcoder.abc.abc170;

import java.util.Scanner;

public class ABC170_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int[] x = new int[5];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                System.out.println(i+1);
                return;
            }
        }
    }
}
