package com.fengtian.qianer.atcoder.abc.abc164;

import java.util.Scanner;

public class ABC164_B {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        while (true) {
            C -= B;

            if (C <= 0) {
                System.out.println("Yes");
                break;
            }

            A -= D;

            if (A <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}
