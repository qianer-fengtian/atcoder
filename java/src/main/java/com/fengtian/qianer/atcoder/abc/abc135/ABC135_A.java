package com.fengtian.qianer.atcoder.abc.abc135;

import java.util.Scanner;

public class ABC135_A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long A = Long.parseLong(sc.next());
    long B = Long.parseLong(sc.next());

    long n = Math.abs(A - (A-B) / 2);

    if (Math.abs(A-n) == Math.abs(B-n)) {
      System.out.println(n);
    } else {
      System.out.println("IMPOSSIBLE");
    }
  }
}