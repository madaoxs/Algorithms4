package com.company.suanfa1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearchCount1_1_29 {
    public static int rank(int key, int[] a){
        int lo =0;
        int hi =a.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if      (key < a[mid] )hi= mid-1;
            else if (key > a[mid] )lo= mid+1;
            else {
                while(a[mid-1]==a[mid]&&mid>0)mid--;
                return mid;
            }
        }
        return lo;
    }
    public static int count(int key, int[] a){
        int N=rank(key,a);
        if(a[N]==key){
            int j=0;
            while (a[N++]==key)j++;
            return j;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] whitelist=new In("C:\\Users\\MADAO\\IdeaProjects\\qwer\\algs4\\src\\com\\company\\suanfa1_1\\tiny").readAllInts();
        Arrays.sort(whitelist);
        StdOut.println(rank(30,whitelist));
        StdOut.print(count(30,whitelist));
    }
}
