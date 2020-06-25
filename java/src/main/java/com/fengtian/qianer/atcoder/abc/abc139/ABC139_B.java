package com.fengtian.qianer.atcoder.abc.abc139;

import java.util.Scanner;

public class ABC139_B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();

    int ans = 0;
    int c = 1;
    while (c < B) {
        c--;
        c += A;
        ans++;
    }

    System.out.println(ans);
  }
}