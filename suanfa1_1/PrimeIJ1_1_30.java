package com.company.suanfa1_1;

import edu.princeton.cs.algs4.StdOut;

public class PrimeIJ1_1_30 {

    public static int gcd(int a, int b){

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
    public static boolean[][] setPrimeBoolean(boolean[][] a){
        int N=a.length;int M=a[0].length;
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                if (gcd(i,j)==1)a[i][j]=true;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        boolean[][] a=new boolean[10][20];
        a=setPrimeBoolean(a);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                StdOut.print(a[i][j]+" ");
            }
            StdOut.println();
        }
    }
}
