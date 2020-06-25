package com.fengtian.qianer.atcoder.abc.abc131;

import java.util.Scanner;

public class ABC131_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final char[] S = sc.next().toCharArray();

        if (S[0] == S[1] || S[1] == S[2] || S[2] == S[3]) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}
