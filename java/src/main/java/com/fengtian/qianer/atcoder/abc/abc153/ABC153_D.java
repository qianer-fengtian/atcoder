package com.fengtian.qianer.atcoder.abc.abc153;

import java.util.Scanner;

public class ABC153_D {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long h = sc.nextLong();

        System.out.println((long)Math.pow(2, Long.toBinaryString(h).length()) - 1);
    }

}
