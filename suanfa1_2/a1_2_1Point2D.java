package suanfa1_2;

import edu.princeton.cs.algs4.*;

public class a1_2_1Point2D {
    private int N;
    private Point2D[] point ;
    public a1_2_1Point2D(int N){
        this.N = N;
        point=new Point2D[N];
    }
    public void drawPoint(){

        Interval1D xinterval=new Interval1D(.2,.7);
        Interval1D yinterval=new Interval1D(.2,.7);
        Interval2D square=new Interval2D(xinterval,yinterval);
        square.draw();

        StdDraw.setPenRadius(.005);
        for (int i = 0; i < N; i++) {
            double x= StdRandom.uniform(.2,.7);
            double y= StdRandom.uniform(.2,.7);
            point[i]=new Point2D(x,y);
            point[i].draw();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                StdOut.println("point"+i+" to point"+j+" "+point[i].distanceTo(point[j])+" ");
            }
        }
    }

    public static void main(String[] args) {
        a1_2_1Point2D test=new a1_2_1Point2D(5);
        test.drawPoint();
    }

}
