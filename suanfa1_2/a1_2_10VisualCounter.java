package suanfa1_2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class a1_2_10VisualCounter {
    private int N;
    private int max;
    private int count = 0;
    private int times = 0;
    a1_2_10VisualCounter(int N,int max){
        this.N=N;
        this.max=max;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,2*max);
        StdDraw.setPenRadius(.007);
    }
    void increment(){
        count++;
        times++;
        if ((times<=N)&&(Math.abs(count)<max)){
            StdDraw.point(times,max+count);
        }
    }
    void decline(){
        count--;
        times++;
        if ((times<=N)&&(Math.abs(count)<=max)){
            StdDraw.point(times,max+count);
        }
    }

    public static void main(String[] args) {
        int N=50;
        a1_2_10VisualCounter test=new a1_2_10VisualCounter(N,100);
        for (int i = 0; i < 51; i++) {
            if (StdRandom.bernoulli(0.3)) test.increment();
            else                             test.decline();
        }
    }
}
