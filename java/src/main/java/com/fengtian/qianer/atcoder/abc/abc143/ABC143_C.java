package com.fengtian.qianer.atcoder.abc.abc143;

import java.util.Scanner;

public class ABC143_C {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();

    int ans = 1;
    char[] c = s.toCharArray();
    for (int i = 1; i < n; i++) {
      if (c[i] != c[i-1]) ans++;
    }

    System.out.println(ans);
  }
}