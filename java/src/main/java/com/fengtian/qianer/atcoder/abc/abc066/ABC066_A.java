package com.fengtian.qianer.atcoder.abc.abc066;

import java.util.Scanner;

public class ABC066_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();

        System.out.println(Math.min(a+b, Math.min(b+c, c+a)));
    }
}
