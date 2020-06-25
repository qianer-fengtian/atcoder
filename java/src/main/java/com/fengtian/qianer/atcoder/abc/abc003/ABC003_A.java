package com.fengtian.qianer.atcoder.abc.abc003;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC003_A {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        System.out.println(IntStream.rangeClosed(1,N).map(i -> i * 10000).sum() / N);
    }
}
