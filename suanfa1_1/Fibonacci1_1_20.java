package com.company.suanfa1_1;

public class Fibonacci1_1_20 {
    public static long Fib(int N) {

        long a[] = new long[N + 1];
        return Fib(N, a);

    }

    public static long Fib(int N, long a[]) {

        if (N == 0) {
            a[N] = 0;
        }
        if (N == 1) {
            a[N] = 1;
        } else if (N > 1) {
            a[N] = Fib(N - 1, a) + Fib(N - 2, a);
        }

        return a[N];

    }


}
