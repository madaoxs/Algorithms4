package com.company.suanfa1_1;

import edu.princeton.cs.algs4.*;


import java.awt.*;

public class RandomConnect1_1_31 {
    private int N=0;
    private double p=0.0;
    RandomConnect1_1_31(int N,double p){
        this.N=N;this.p=p;
        StdDraw.setCanvasSize(1000,1000);
    }
    public void RandomConnec(){
        //draw circle
        StdDraw.setXscale(0,40);
        StdDraw.setYscale(0,40);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.circle(20,20,10);
        //draw points
        StdDraw.setPenRadius(.05);
        StdDraw.setPenColor(StdDraw.GREEN);
        double point[][]=new double[N][2];
        for (int i = 0; i < N; i++) {
            point[i][0]=20+10*Math.sin(2*Math.PI*i/N);
            point[i][1]=20+10*Math.cos(2*Math.PI*i/N);
            StdDraw.point(point[i][0],point[i][1]);
        }
        //draw lines
        StdDraw.setPenRadius(.005);
        StdDraw.setPenColor(StdDraw.CYAN);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (StdRandom.bernoulli(p))StdDraw.line(point[i][0],point[i][1],point[j][0],point[j][1]);
            }
        }
    }
    public static void main(String[] args)
    {
        new RandomConnect1_1_31(20,0.1).RandomConnec();
    }
}
