package com.fengtian.qianer.atcoder.abc.abc149;

import java.util.Scanner;

public class ABC149_C {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int x = sc.nextInt();

        for (int i = x; i <= 110000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}