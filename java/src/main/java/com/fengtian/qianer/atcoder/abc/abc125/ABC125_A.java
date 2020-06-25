package com.fengtian.qianer.atcoder.abc.abc125;

import java.util.Scanner;

public class ABC125_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int t = sc.nextInt();

        System.out.println((int)Math.floor((t+0.5) / a) * b);
    }
}
