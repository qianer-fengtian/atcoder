package com.fengtian.qianer.atcoder.abc.abc164;

import java.util.Scanner;

public class ABC164_A {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int S = sc.nextInt();
        final int W = sc.nextInt();
        if (W >= S) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
