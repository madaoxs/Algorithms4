package com.company.suanfa1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class suanfa1_1_11 {
    //初始化数组
    static boolean[][] InitialBoolean(boolean[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = StdRandom.bernoulli(0.5);
            }
        }
        return a;
    }
    //打印方阵
    static void printBoolean(boolean[][] a){
        StdOut.print("   ");
        for (int i = 0; i < a[0].length; i++) {
            StdOut.printf("%3d",i+1);
        }
        StdOut.println();
        for (int i = 0; i < a.length; i++) {
            StdOut.printf("%3d",i+1);
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j])StdOut.print(" * ");
                else    StdOut.print("   ");
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] a=new boolean[10][9];
        a=suanfa1_1_11.InitialBoolean(a);
        suanfa1_1_11.printBoolean(a);
    }
}
