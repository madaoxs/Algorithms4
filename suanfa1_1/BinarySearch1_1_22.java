package com.company.suanfa1_1;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch1_1_22 {
    private static int n;
    public static int rank(int key, int[] a ){
        return rank(key, a, 0,a.length-1);
    }
    public static int rank(int key, int[] a, int lo,int hi){
        n++;
        StdOut.print(n+" times");
        for (int i = 0; i < n-1; i++) {
            StdOut.print("  ");
        }
        StdOut.println("lo:"+lo+" hi:"+hi);
        if (lo > hi){n=0;return -1;}
        int mid = lo+(hi-lo)/2;
        if      (key<a[mid])    return rank(key, a, lo, mid - 1);
        else if (key > a[mid])  return rank(key,a ,mid+1,hi);
        else                    {n=0;   return mid;}
    }

    public static void main(String[] args) {
        int[] whitelist =new In("C:\\Users\\MADAO\\IdeaProjects\\qwer\\algs4\\src\\com\\company\\suanfa1_1\\tiny").readAllInts();
        Arrays.sort(whitelist);
        // read key; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1)
                StdOut.println(key);
        }

    }
}
