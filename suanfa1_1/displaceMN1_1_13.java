package com.company.suanfa1_1;

import edu.princeton.cs.algs4.StdOut;

//置换数组
public class displaceMN1_1_13 {
    //初始化
    public static  int[][] InitialArray(int a[][]){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=i*10+j;
            }
        }
        return a;
    }
    public static  void displayArray(int[][] a){
        //置换打印
        for (int i = a.length-1; i >= 0 ; i--) {
            StdOut.println();
            for (int j = a[i].length-1; j >= 0; j--) {
                StdOut.printf("%3d",a[i][j]);
            }
        }
        //正常打印
        StdOut.println();
        for (int i = 0; i <a.length ; i++) {
            StdOut.println();
            for (int j = 0; j <a[0].length ; j++) {
                StdOut.printf("%3d",a[i][j]);
            }
        }
    }
    //test
    public static void main(String[] args) {
        int[][] a=new int[10][5];
        a=displaceMN1_1_13.InitialArray(a);
        displaceMN1_1_13.displayArray(a);
    }
}
