package com.fengtian.qianer.atcoder.abc.abc041;

import java.util.Scanner;

public class ABC041_B {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long DIV = 1000000007;

        final long A = sc.nextLong();
        final long B = sc.nextLong();
        final long C = sc.nextLong();

        System.out.println(A%DIV*B%DIV*C%DIV%DIV);
    }
}
