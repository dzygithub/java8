package com.cisco.ds2.utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MyArray {

    public MyArray() {
    }

    public static List<String> distinctPrimary(String... str){
        List<String> ls = (List<String>) Arrays.asList(str);
        List<String> lss = ls.stream().distinct().collect(Collectors.toList());
        return lss;
    }

    public static List<String> distinctPrimary1(String... str){
        List<String> s = new ArrayList<>();
         for(int i=0;i<str.length;i++){
             if(!s.contains(str[i])){
                 s.add(str[i]);
             }
         }
         return s;
    }


    public static void newArrays(){
        String[] ids={"11","12","13"};
        String[] contents={"a"};

        String[] z1 = new String[0];
        if(ids.length != contents.length){
            int diff = ids.length - contents.length;
            int z0 = diff + contents.length;
            z1 = new String[z0];
            for (int i = 0; i < contents.length; i++) {
                z1[i] = contents[i];
            }
        }
        String[] z3 =  Arrays.stream(z1).map(i -> {
            return i == null ? "" : i;
        }).toArray(String[]::new);
        Arrays.stream(z3).forEach(System.out::println);

    }

    public static void main(String[] args) throws Exception {

        String as = Arrays.toString(new int[]{1,2,3});
        String[] str = new String[10000000];
        for(int j=0;j<str.length;j++){
            Random rand=new Random();
            int i = rand.nextInt(32);
            str[j] = String.valueOf(i);
        }
        System.out.println(str.length);
        MyDate myDate = new MyDate();
        long startl = myDate.getEpochMilli();
        List<String> filterList = MyArray.distinctPrimary(str);
        filterList.forEach(item-> System.out.print(item+" "));
        long endl = myDate.getEpochMilli();
        System.out.println( "   " + (endl - startl)); // 269

        startl = myDate.getEpochMilli();
        List<String> filterList1 = MyArray.distinctPrimary1(str);
        filterList1.forEach(item-> System.out.print(item+" "));
        endl = myDate.getEpochMilli();
        System.out.println( "   " + (endl - startl)); // 460

        MyArray.newArrays();

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName( "JavaScript" );
        System.out.println( engine.getClass().getName());
        System.out.println( "Result:" + engine.eval( "function f() { return 1; }; f() + 1;" ) );
    }

}
