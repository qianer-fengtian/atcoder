package com.fengtian.qianer.atcoder.abc.abc139;

import java.util.Scanner;

public class ABC139_A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char[] s = sc.next().toCharArray();
    char[] t = sc.next().toCharArray();
    
    int ans = 0;
    for (int i = 0; i < 3; i++) {
        if (s[i] == t[i]) ans++;
    }

    System.out.println(ans);
  }
}