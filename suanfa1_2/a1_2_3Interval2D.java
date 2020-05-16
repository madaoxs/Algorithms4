package suanfa1_2;

import edu.princeton.cs.algs4.*;

public class  a1_2_3Interval2D {
    private int N;
    private double min, max;
    private Interval2D[] square;

    a1_2_3Interval2D(int N,double min, double max){
        this.N=N;this.min=min;this.max=max;
        square=new Interval2D[N];
    }
    public void drawIntersectSquare(){
        StdDraw.setPenColor(StdDraw.RED);
        new Interval2D(new Interval1D(min,max),new Interval1D(min,max)).draw();


        Point2D[][] points = new Point2D[N][4];
        for (int i = 0; i < N; i++) {
            Interval1D[] intervals=new Interval1D[2];
            for (int j = 0; j <2; j++) {
                double x = StdRandom.uniform(min, max);
                double y = StdRandom.uniform(min, max);
                points[i][j]=new Point2D(x,0);
                points[i][j+2]=new Point2D(y,0);
                if (x > y) {
                    x = x + y;
                    y = x - y;
                    x = x - y;
                }
                intervals[j]=new Interval1D(x,y);
            }
            points[i][0]=new Point2D(points[i][0].x(),points[i][1].x());
            points[i][1]=new Point2D(points[i][2].x(),points[i][0].y());
            points[i][2]=new Point2D(points[i][0].x(),points[i][3].x());
            points[i][3]=new Point2D(points[i][1].x(),points[i][2].y());

            square[i]=new Interval2D(intervals[0],intervals[1]);
        }


        int contain = 0;
        int intersect=0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N ; j++) {
                if (square[i].intersects(square[j])){
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.setPenRadius(.003);
                    square[i].draw();
                    square[j].draw();
                    intersect++;
                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.setPenRadius(.01);
                    for (int k = 0; k < 4; k++) {
                        points[i][k].draw();
                        points[j][k].draw();
                    }
                    if ((square[i].contains(points[j][0])&&square[i].contains(points[j][3]))||
                            (square[j].contains(points[i][0])&&square[j].contains(points[i][3]))) {
                        StdDraw.setPenRadius(.006);
                        StdDraw.setPenColor(StdDraw.MAGENTA);
                        square[i].draw();square[j].draw();
                        contain++;
                    }
                }

            }

        }
        StdOut.println("countain:"+contain+"  intersect:"+intersect);
    }

    public static void main(String[] args) {
        a1_2_3Interval2D test= new a1_2_3Interval2D(5,.2,.6);
        test.drawIntersectSquare();

    }
}
