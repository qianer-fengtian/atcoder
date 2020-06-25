package com.fengtian.qianer.atcoder.abc.abc041;

import java.util.*;

public class ABC041_C {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final Long[] a = new Long[N];
        final Map<Long, Integer> rank = new HashMap<>();

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
            rank.put(a[i], i+1);
        }

        Arrays.sort(a, Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {
            System.out.println(rank.get(a[i]));
        }
    }
}
