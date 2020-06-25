package com.fengtian.qianer.atcoder.abc.abc137;

import java.util.Scanner;

public class ABC137_A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    System.out.println(Math.max(A+B, Math.max(A-B, A*B)));
  }
}