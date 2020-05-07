package com.company.suanfa1_1;

public class BinarySearch1_1_23 {
    public static int rank(int key,int[]a,char c){
        int lo = 0;
        int hi = a.length - 1;
        if(c=='+'){
           while(lo<=hi){

                int mid=lo+(hi-lo)/2;
                if(key<a[mid])hi=mid-1;
                else   if(key>a[mid])lo=mid+1;
                else return mid;
           }
        return-1;
    }
    if(c=='-') {
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if(key < a[mid]) hi = mid - 1;
                else if(key > a[mid]) lo = mid + 1;
                else return -1;
            }

            return 0;
        }
       else return -1;
    }
}
