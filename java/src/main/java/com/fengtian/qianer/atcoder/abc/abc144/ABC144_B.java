package com.fengtian.qianer.atcoder.abc.abc144;

import java.util.Scanner;

public class ABC144_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean ans = false;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (n == i * j) ans = true;
            }
        }

        System.out.println(ans ? "Yes" : "No");
    }
}
