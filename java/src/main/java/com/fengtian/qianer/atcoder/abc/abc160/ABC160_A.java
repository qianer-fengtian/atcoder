package com.fengtian.qianer.atcoder.abc.abc160;

import java.util.Scanner;

public class ABC160_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String s = sc.next();
        final char[] c = s.toCharArray();

        if (c[2] == c[3] && c[4] == c[5]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
