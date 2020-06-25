package com.fengtian.qianer.atcoder.abc.abc143;

import java.util.Scanner;

public class ABC143_A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a - b - b > 0 ? a - b - b : 0);
  }
}