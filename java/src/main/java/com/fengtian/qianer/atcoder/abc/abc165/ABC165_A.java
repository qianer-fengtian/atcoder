package com.fengtian.qianer.atcoder.abc.abc165;

import java.util.Scanner;

public class ABC165_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int k = sc.nextInt();
        final int a = sc.nextInt();
        final int b = sc.nextInt();

        for (int i = k; i <= b; i += k) {
            if (a <= i && i <= b) {
                System.out.println("OK");
                return;
            }
        }
        System.out.println("NG");
    }
}
