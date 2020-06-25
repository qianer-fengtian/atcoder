package com.fengtian.qianer.atcoder.abc.abc090;

import java.util.Scanner;

public class ABC090_C {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long M = sc.nextLong();

        System.out.println(Math.abs((N-2) * (M-2)));
    }
}
