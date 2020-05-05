package com.company.suanfa1_1;

import edu.princeton.cs.algs4.StdOut;

public class mystery1_1_18 {
    public static int mystery(int a,int b){
        if(b==0)return 1;
        if(b%2==0)return mystery(a*a,b/2);
        return mystery(a*a,b/2)*a;
    }

    public static void main(String[] args) {
        StdOut.println(mystery(2,25));
        StdOut.println(mystery(3,11));
    }

}
//给的算法研究了半个多小时才悟，很厉害的计算指数的方法，此题详解见博客https://pants.fakesheep.xyz