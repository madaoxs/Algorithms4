package com.company.suanfa1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdStats;

public class Histogram1_1_32 {
    public static void Histogram(int N, double r,double l,double[] list){
        double[][] gram = new double[N][2];
        double k=Math.abs(l-r)/N;
        for (int i = 0; i < N ; i++)    gram[i][0]=k*(i+1);
        //draw
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < N; j++) {
                if (list[i]<=gram[j][0] && list[i]>(gram[j][0]-k))gram[j][1]++;
            }
        }
        StdDraw.setCanvasSize(1000,1000);
        StdDraw.setPenRadius(.005);
        StdDraw.setXscale(0,100);StdDraw.setYscale(0,100);
        StdDraw.setPenColor(StdDraw.RED);
        //StdDraw.rectangle(20,20,5,5);
        StdDraw.line(10,15,80,15);
        for (int i = 0; i < N; i++) {
            StdDraw.line(10+i*k*5,15,10+(i+1)*k*5,15);
            StdDraw.line(10+i*k*5,15,10+i*k*5,15+gram[i][1]*5);
            StdDraw.line(10+(i+1)*k*5,15,10+(i+1)*k*5,15+gram[i][1]*5);
            StdDraw.line(10+(i+1)*k*5,15+gram[i][1]*5,10+i*k*5,15+gram[i][1]*5);
        }
    }
    public static void main(String[] args)
    {
        double[] list =new In("C:\\Users\\MADAO\\IdeaProjects\\qwer\\algs4\\src\\com\\company\\suanfa1_1\\input1_1_32").readAllDoubles();
        Histogram(7,0,7,list);
    }
}
