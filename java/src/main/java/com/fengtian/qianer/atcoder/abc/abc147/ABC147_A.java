package com.fengtian.qianer.atcoder.abc.abc147;

import java.util.Scanner;

public class ABC147_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += Integer.parseInt(sc.next());
        }
        System.out.println(sum >= 22 ? "bust" : "win");
    }
}
