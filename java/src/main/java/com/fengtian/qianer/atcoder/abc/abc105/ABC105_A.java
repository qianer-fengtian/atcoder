package com.fengtian.qianer.atcoder.abc.abc105;

import java.util.Scanner;

public class ABC105_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int k = sc.nextInt();

        System.out.println(n % k == 0 ? 0 : 1);
    }
}
