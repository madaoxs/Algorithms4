package com.company.suanfa1_1;

import edu.princeton.cs.algs4.StdOut;

public class Euclidean1_1_24 {
    public static int gcd(int a,int b){

        if(a>=b);
        else {
            a+=b;
            b=a-b;
            a=a-b;
        }
        StdOut.println(" a="+a+" b="+b );
       if (a%b==0)return b;
       a=a%b;
       return gcd(b,a);
    }

    public static void main(String[] args) {
        StdOut.print(gcd(1111111,1234567));
    }
}
