package suanfa1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class a1_2_2Interval1D {
    private int N;
    private Interval1D[] intervals;
    a1_2_2Interval1D(int N){
        this.N=N;
        intervals=new Interval1D[N];
    }
    public void printIntersectInterval (){
        for (int i = 0; i < N; i++) {
            double x= Math.random();
            double y= Math.random();
            if (x>y){x=x+y;y=x-y;x=x-y;}
            intervals[i]=new Interval1D(x,y);
        }
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (intervals[i].intersects(intervals[j])) StdOut.println(intervals[i]+" INTERSECT "+intervals[j]);
            }
        }
    }

    public static void main(String[] args) {
        a1_2_2Interval1D test=new a1_2_2Interval1D(4);
        test.printIntersectInterval();

    }
}
