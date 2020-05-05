package com.company.suanfa1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ifequal1_1_3 {
    public static void main(String[] args) {
        // write your code here
        int a,b,c;
        a= StdIn.readInt();
        b= StdIn.readInt();
        c= StdIn.readInt();
        if(a==b&&b==c)
            StdOut.print("equal");
        else StdOut.print("not equal");
    }
}
