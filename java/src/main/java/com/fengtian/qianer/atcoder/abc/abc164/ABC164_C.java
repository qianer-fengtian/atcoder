package com.fengtian.qianer.atcoder.abc.abc164;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC164_C {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final Set S = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            S.add(sc.next());
        }

        System.out.println(S.size());
    }
}
