package com.fengtian.qianer.atcoder.abc.abc171;

import java.util.Scanner;

public class ABC171_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String a = sc.next();

        System.out.println(a.equals(a.toUpperCase()) ? "A" : "a");
    }
}
