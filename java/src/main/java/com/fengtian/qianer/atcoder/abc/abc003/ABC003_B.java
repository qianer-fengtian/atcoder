package com.fengtian.qianer.atcoder.abc.abc003;

import java.util.Scanner;

public class ABC003_B {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();
        final String T = sc.next();

        boolean won = true;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '@' && T.charAt(i) == '@') {
                continue;
            }

            if (   (S.charAt(i) != '@' && T.charAt(i) != '@' && S.charAt(i) != T.charAt(i))
                || (S.charAt(i) == '@' && "atcoder".indexOf(T.charAt(i)) == -1)
                || (T.charAt(i) == '@' && "atcoder".indexOf(S.charAt(i)) == -1)) {
                won = false;
                break;
            }
        }

        if (won) {
            System.out.println("You can win");
        } else {
            System.out.println("You will lose");
        }
    }
}
