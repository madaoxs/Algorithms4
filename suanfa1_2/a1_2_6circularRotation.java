package suanfa1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class a1_2_6circularRotation {
    public static boolean ifCircularRotation(String s,String t){
        if ((s+s).indexOf(t)!=-1&&(s.length()==t.length()))return true;
        else return false;
    }

    public static void main(String[] args) {
        StdOut.println(a1_2_6circularRotation.ifCircularRotation(StdIn.readString(),StdIn.readString()));
    }
}
