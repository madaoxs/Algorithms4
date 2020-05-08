package com.company.suanfa1_1;

public class Matrix1_1_33 {
    //向量点乘
    static double dot(double[] x, double[] y){
        if (x.length!=y.length)return 0;
        int N=x.length;double dot=0.0;
        for (int i = 0; i < N; i++) {
            dot+=x[i]*y[i];
        }
        return dot;
    }
    //矩阵*矩阵
    public static double[][] multiple(double[][] a, double[][] b) {
        if(a[0].length != b.length)
            System.exit(-1);
        double[][] matrix = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < b[0].length; ++j)
                for (int k = 0; k < b.length; ++k)
                    matrix[i][j] += a[i][k] * b[k][j];
        return matrix;
    }

    public static double[] mult(double[][] a, double[] x) {
        if(a[0].length != x.length)
            System.exit(-1);
        double[] matrix = new double[x.length];
        for(int i = 0; i < a.length; ++i)
            for(int j = 0; j < x.length; ++j)
                matrix[i] += a[i][j] * x[j];
        return matrix;
    }

    public static double[] mult(double[] y, double[][] a) {
        double[] matrix = new double[y.length];
        for(int i = 0; i < y.length; ++i)
            for(int j = 0; j < a[i].length; ++j)
                matrix[i] += y[j] * a[j][i];
        return matrix;
    }


    public static double[][] trans(double[][] a) {
        for(int i = 0; i < a.length; ++i)
            for(int j = 0; j < i; ++j) {
                double temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        return a;
    }
}

