package com.fengtian.qianer.atcoder.abc.abc144;

import java.util.Scanner;

public class ABC144_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a <= 9 && b <= 9 ? a * b : -1);
    }
}
