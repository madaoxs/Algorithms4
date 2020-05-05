package com.company.suanfa1_1;

import edu.princeton.cs.algs4.StdOut;
// 计算log2 (N)
public class log1_1_15 {
    public static int lg(int n ){
        int i=0;

        while(n>=2){
            n=n/2;
            i++;
        }
        return i;
    }
//test
    public static void main(String[] args) {
       StdOut.println(Math.log(8)/Math.log(2));
       StdOut.println(lg(8) );
       StdOut.println(Math.log(19)/Math.log(2)+"  "+lg(19));
    }
}
