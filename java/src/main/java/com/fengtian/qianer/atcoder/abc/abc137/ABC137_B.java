package com.fengtian.qianer.atcoder.abc.abc137;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ABC137_B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int K = sc.nextInt();
    int X = sc.nextInt();

    long m = Math.max(-1000000, X-K+1);
    long n = Math.min(1000000, X+K-1);

    System.out.println(LongStream.rangeClosed(m, n).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
  }
}