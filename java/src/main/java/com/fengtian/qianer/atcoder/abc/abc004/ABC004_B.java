package com.fengtian.qianer.atcoder.abc.abc004;

import java.util.Scanner;

public class ABC004_B {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String[][] board = new String[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = sc.next();
            }
        }

        for (int i = 3; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
