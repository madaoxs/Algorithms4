package com.company.suanfa1_1;

public class ln_N_1_1_20 {

    public static double ln(int N){
        if (N > 1) {
            return Math.log(N)+ln(N-1);
        }
        else
            return 0;
    }
}
