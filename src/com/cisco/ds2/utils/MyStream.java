package com.cisco.ds2.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyStream {
    private int id;
    private String groupId;
    private String name;

    public MyStream(int i, String firstName, String name) {
        this.id = i;
        this.groupId = firstName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //1.分组计数
        List<MyStream> list1= Arrays.asList(new MyStream(1,"one","zhao"),
                new MyStream(2,"one","qian"),
                new MyStream(3,"two","sun"));
        //1.1根据某个属性分组计数
        Map<String,Long> result1=list1.stream().collect(Collectors.groupingBy(MyStream::getGroupId,Collectors.counting()));
        System.out.println(result1);
        //1.3根据分组的key值对结果进行排序、放进另一个map中并输出
        Map<String,Long> xMap=new HashMap<>();
        result1.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByKey().reversed()) //reversed不生效
                .forEachOrdered(x->xMap.put(x.getKey(),x.getValue()));
        System.out.println(xMap);

        //2.分组，并统计其中一个属性值得sum或者avg:id总和
        Map<String,Integer> result3=list1.stream().collect(
                Collectors.groupingBy(MyStream::getGroupId,Collectors.summingInt(MyStream::getId))
        );
        System.out.println(result3);
    }
}
