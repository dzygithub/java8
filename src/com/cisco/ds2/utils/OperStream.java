package com.cisco.ds2.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OperStream {

    private String[] ts = new String[]{"1", "2", "3"};

    public void loop1() {
        int i = 0;
        for (; i < ts.length; i++) {
            System.out.print(ts[i]);
        }
        //123
    }

    public void loop2() {
        Arrays.stream(ts).forEach(t -> {
            System.out.print(t);
        });
        //123
    }

    public void loop3() {
        List<String> ls = new ArrayList();
        Arrays.stream(ts).forEach(t -> {
            ls.add(t);
        });
        ls.stream().forEach(t -> System.out.print(t));
        //123
    }

    public void loop4() {
        int i = 5;
        int[] is = new int[]{1, 2, 3};
        //Arrays.stream(is).forEach(t-> i = i + t);
        Arrays.asList(is).sort((e1, e2) -> {
            return 1;
        });
    }

    public void loop5() {
        Integer[] is = new Integer[]{1, 2, 3};
        Stream resultList = Arrays.asList(is).stream().filter(s -> {
            return s > 1;
        });
        resultList.forEach(e -> System.out.print(e));
        //23
    }

    public void loop6() {
        Integer[] is = new Integer[]{1, 2, 3};
        Stream resultList = Arrays.asList(is).stream().map(s -> {
            int l = s + 5;
            return l;
        });
        resultList.forEach(System.out::print);
        //678
    }

    public void loop7() {
        Integer[] is = new Integer[]{1, 2, 3};
        Optional<Integer> result = Arrays.asList(is).stream().reduce((a, b) -> a + b);
        System.out.println(result.get());
        //6
    }

    public void max8() {
        Integer[] is = new Integer[]{1, 2, 3, 8, 9, 5, 4};
        Optional<Integer> result = Arrays.asList(is).stream().reduce((a, b) -> {
            return a > b ? a : b;
        });
        System.out.println(result.get());
        //9
    }

    public static void main(String[] args) {
        OperStream ol = new OperStream();
        ol.loop1();
        System.out.println("");
        ol.loop2();
        System.out.println("");
        ol.loop3();
        System.out.println("");
        ol.loop4();
        System.out.println("");
        ol.loop5();
        System.out.println("");
        ol.loop6();
        System.out.println("");
        ol.loop7();
        System.out.println("");
        ol.max8();
    }

}
