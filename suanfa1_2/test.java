package suanfa1_2;

import edu.princeton.cs.algs4.*;

public class test {
    static void countadd(Integer[] counter){counter = new Integer[3];}
    public static void main(String[] args) {
        Integer[] counter = new Integer[2];
        for (Integer i:counter){
            StdOut.println(i);
        }
        countadd(counter);
        for (Integer i:counter){
            StdOut.println(i);
        }


    }
}
