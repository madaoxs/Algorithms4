package com.company.suanfa1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class form1_1_21 {
    public static void main(String[] args) {
        String[] a=StdIn.readAllStrings();
        for (int i = 0; i < a.length; i+=3) {
            int m=Integer.parseInt(a[i+1]);
            int n=Integer.parseInt(a[i+2]);
            StdOut.printf("name:%s  %d  %d  %.3f",a[i],m,n,(double)m/n);
            StdOut.println();
        }
    }
}
