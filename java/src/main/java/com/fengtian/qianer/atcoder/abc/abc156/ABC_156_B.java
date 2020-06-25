package com.fengtian.qianer.atcoder.abc.abc156;

import java.util.Scanner;

public class ABC_156_B {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int K = sc.nextInt();
        System.out.println(Integer.toString(Integer.parseInt(Integer.toBinaryString(N), 2), K).length());
    }
}
