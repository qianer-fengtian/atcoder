package com.fengtian.qianer.atcoder.abc.abc138;

import java.util.Scanner;

public class ABC138_A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    String s = sc.next();

    System.out.println(a >= 3200 ? s : "red");
  }
}