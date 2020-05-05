package com.company.suanfa1_1;

import edu.princeton.cs.algs4.StdOut;

public class histogram1_1_15 {
    public static int[] histogram(int[] a,int M){
        int[] b=new int[M];
        int N = a.length;
        for (int i = 0; i < N; i++)
            if (a[i] <= M) {
                b[a[i]]++;
            }
        return b;
    }
}
