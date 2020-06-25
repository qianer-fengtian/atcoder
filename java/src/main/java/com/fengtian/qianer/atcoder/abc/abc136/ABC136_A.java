package com.fengtian.qianer.atcoder.abc.abc136;

import java.util.Scanner;

public class ABC136_A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    System.out.println(Math.max(C - (A - B), 0));
  }
}