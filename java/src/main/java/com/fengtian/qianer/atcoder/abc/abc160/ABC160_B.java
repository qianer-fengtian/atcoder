package com.fengtian.qianer.atcoder.abc.abc160;

import java.util.Scanner;

public class ABC160_B {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int x = sc.nextInt();

        System.out.println((x / 500 * 1000) + (x % 500 / 5 * 5));
    }
}
