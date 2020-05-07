package com.company.suanfa1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class deleteRepeatElement1_1_28 {
    private static int N;
    public static int[] rank(int[] a){
        N=a.length-1;
        for (int i = 0; i < N; i++) {
            if (a[i]==a[i+1])a=deleteRepeatElement(i,a);
        }
        return a;
    }
    public static int[] deleteRepeatElement(int key,int[]a){
        if ((key==a.length-1) || a[key]!=a[key+1])return a;
        N=a.length-1;
        int[] b=new int[a.length-1];
        for (int i=0,j=0;i<a.length;i++){
            if (i==key)continue;
            b[j]=a[i];
            j++;
        }
        for (int i = 0; i < b.length; i++) {
            StdOut.print(b[i]);
        }
        StdOut.println();
        return deleteRepeatElement(key,b);
    }
    public static void main(String[] args) {
        String[] string =new In("C:\\Users\\MADAO\\IdeaProjects\\qwer\\algs4\\src\\com\\company\\suanfa1_1\\tiny").readAllStrings();
        int[] whitelist=new int[string.length];
        for (int i = 0; i < string.length; i++) {
            whitelist[i]=Integer.parseInt(string[i]);
        }
        Arrays.sort(whitelist);
        whitelist=rank(whitelist);
        for (int i: whitelist) {
            StdOut.print(i);
        }

    }
}
