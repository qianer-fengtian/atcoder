package com.fengtian.qianer.atcoder.abc.abc088;

import java.util.Scanner;

public class ABC088_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int A = sc.nextInt();

        System.out.println(N % 500 <= A ? "Yes" : "No");
    }
}
