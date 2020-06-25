package com.fengtian.qianer.atcoder.orc.tokiomarine2020;

import java.util.Scanner;

public class TOKIOMARINE_2020_B {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long A = sc.nextLong();
        final long V = sc.nextLong();
        final long B = sc.nextLong();
        final long W = sc.nextLong();
        final long T = sc.nextLong();

        System.out.println(Math.abs(A-B)<=T*(V-W) ? "YES": "NO");
    }
}
