package com.cisco.ds2.pattern;

public class Single {

    // positive mode, thread safe
    private static final Single single = new Single();

    private Single() {
    }

    public static Single getInstance(){
        return Single.single;
    }

    public static void main(String[] args) {
        Single single1 = Single.getInstance();
        Single single2 = Single.getInstance();
        System.out.println(single1 == single2);
    }
}
