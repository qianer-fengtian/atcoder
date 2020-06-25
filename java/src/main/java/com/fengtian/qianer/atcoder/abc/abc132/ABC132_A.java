package com.fengtian.qianer.atcoder.abc.abc132;

import java.util.Arrays;
import java.util.Scanner;

public class ABC132_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String s = sc.next();
        final char[] c = s.toCharArray();

        Arrays.sort(c);

        System.out.println(c[0] == c[1] && c[1] != c[2] && c[2] == c[3] ? "Yes" : "No");
    }
}
