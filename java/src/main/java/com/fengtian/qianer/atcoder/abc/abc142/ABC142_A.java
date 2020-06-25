package com.fengtian.qianer.atcoder.abc.abc142;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC142_A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    long cnt = IntStream.range(1, n).filter(i -> i % 2 != 0).count();
    System.out.println((double) (n - cnt) / n);
  }
}