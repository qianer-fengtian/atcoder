package com.fengtian.qianer.atcoder.abc.abc167;

import java.util.Scanner;

public class ABC167_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String s = sc.next();
        final String t = sc.next();

        if (t.substring(0, t.length()-1).equals(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
