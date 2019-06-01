package com.cisco.ds2.sort;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    public long fibo(int generation) {
        if (generation == 1 || generation == 2) {
            return 1;
        }
        return fibo(generation - 1) + fibo(generation - 2);
    }

    public long fibonacciIteratively(int n) {
        if (n <= 2) {
            return 1;
        }
        long fibM2 = 1, fibM1 = 1, fibN = 0;
        for (int i = 3; i <= n; i++) {
            fibN = fibM2 + fibM1;
            fibM2 = fibM1;
            fibM1 = fibN;
        }
        return fibN;
    }

    public long getEpochMilli() {
        Instant date = Instant.now();
        return date.toEpochMilli();
    }

    public static void main(String[] args) {


        String[] str = new String[] { "you", "wu" };
        List list = Arrays.asList(str);
        //list.add("www"); java.lang.UnsupportedOperationException
        // 1, 1, 2, 3, 5, 8, 13 ...
        int x = 40;
        Fibonacci f = new Fibonacci();

        long time1 = f.getEpochMilli();

        System.out.println(f.fibo(x));
        long time2 = f.getEpochMilli();
        System.out.println(time2 - time1);

        System.out.println(f.fibonacciIteratively(x));
        long time3 = f.getEpochMilli();
        System.out.println(time3 - time2);
    }


}
