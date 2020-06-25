package com.fengtian.qianer.atcoder.abc.abc004;

import java.util.Scanner;

public class ABC004_C {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();

        final int[] cards = new int[]{1, 2, 3, 4, 5, 6};

        for (long i = 0; i < N % 30; i++) {
            final int l = (int) (i % 5) ;
            final int r = (int) (i % 5) + 1;
            final int old = cards[r];
            cards[r] = cards[l];
            cards[l] = old;
        }

        for (int card : cards) {
            System.out.print(card);
        }
        System.out.println();
    }
}
