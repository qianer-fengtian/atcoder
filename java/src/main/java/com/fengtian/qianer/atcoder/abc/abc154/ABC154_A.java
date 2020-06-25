package com.fengtian.qianer.atcoder.abc.abc154;

import java.util.Scanner;

public class ABC154_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String S = sc.next();
        final String T = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        final String U = sc.next();

        if (U.equals(S)) A--;
        if (U.equals(T)) B--;
        System.out.println(A + " " + B);
    }
}
