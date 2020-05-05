package com.company.suanfa1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ifbetween1_1_5 {


        public static void main(String[] args) {
            // write your code here
            double a,b;
            a = StdIn.readDouble();
            b = StdIn.readDouble();
            StdOut.print(ifbetween0_1(a)&&ifbetween0_1(b));
        }
        public static boolean ifbetween0_1(double a){
            if(a<1&&a>0)return true;
            else return false;
        }

}
