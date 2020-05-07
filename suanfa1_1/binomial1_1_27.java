package com.company.suanfa1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class binomial1_1_27 {
    public static double binomal(int N,int k, double p){
        if (N==0 && k==0) return 1.0;
        if (N <0|| k<0) return 0.0;
        return(1.0 - p)*binomal(N-1,k,p) + p*binomal(N-1,k-1,p);
    }
}
