package com.fengtian.qianer.atcoder.abc.abc049;

import java.util.Scanner;

public class ABC049_C {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();
        final String ans = S
                .replace("eraser", "")
                .replace("erase", "")
                .replace("dreamer", "")
                .replace("dream", "");

        System.out.println(ans.length() == 0 ? "YES" : "NO");
    }
}
