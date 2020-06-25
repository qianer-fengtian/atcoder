package com.fengtian.qianer.atcoder.abc.abc085;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC085_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final Set D = new HashSet<Integer>();
        for (int i = 0; i < N; i++) D.add(sc.nextInt());

        System.out.println(D.size());
    }
}
