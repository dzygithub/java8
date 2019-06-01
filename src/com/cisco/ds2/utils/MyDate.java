package com.cisco.ds2.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MyDate {

    public MyDate() {
    }

    public LocalDateTime getCurrentDateMinusThreeMonths(int month) {
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime previous = current.minusMonths(month);
        return previous;
    }

    public LocalDateTime getCurrentDateMinusXDay(int days) {
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime previous = current.minusDays(days);
        return previous;
    }

    public long getEpochMilli() {
        Instant date = Instant.now();
        return date.toEpochMilli(); //1559148916346
    }

    public String getTime(String defaultFormat){
        if (defaultFormat == "" || defaultFormat == null){
            defaultFormat = "yyyy-MM-dd HH:mm:ss:SS";
        }
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SS");
        String current = localDateTime.format(dateTimeFormatter);
        return current;
    }

    public String getTime(long timeSeconds){
        Instant instant = Instant.ofEpochSecond(timeSeconds);
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        return this.getTime(null);
    }

    public LocalDateTime getTime(String timeStr, String format){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        LocalDateTime localDateTime = LocalDateTime.parse(timeStr, dateTimeFormatter);
        return localDateTime;
    }

    public long differenceInDaysFromToday(LocalDateTime oldDateTime){
        LocalDateTime current = LocalDateTime.now();
        return ChronoUnit.DAYS.between(current, oldDateTime);
    }


    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSSS");
        MyDate myDate = new MyDate();
        System.out.println("=========getCurrentDateMinusThreeMonths=========");
        LocalDateTime previousDateTime = myDate.getCurrentDateMinusThreeMonths(3);
        System.out.println(previousDateTime.format(formatter));
        System.out.println(previousDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(previousDateTime.getDayOfWeek().getValue());
        System.out.println(previousDateTime.getDayOfYear());
        System.out.println("=========getCurrentDateMinusXDay=========");
        myDate.getCurrentDateMinusXDay(31);

        System.out.println("=========getEpochMilli=========");
        long epochMilli = myDate.getEpochMilli();
        System.out.println(epochMilli);

        String defaultFormat = "yyyy-MM-dd";
        String current = myDate.getTime(null);
        System.out.println(current);
        System.out.println(myDate.getTime(epochMilli));

        System.out.println("=========differenceInDaysFromToday=========");
        long y = myDate.differenceInDaysFromToday(previousDateTime);
        System.out.println(y);
    }

}
