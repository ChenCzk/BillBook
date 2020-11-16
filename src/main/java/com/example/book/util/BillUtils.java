package com.example.book.util;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

public class BillUtils {

    static Map<String, String> map = new HashMap<>();

    static {
        map.put("breakfast", "早餐");
        map.put("lunch", "午餐");
        map.put("dinner", "晚餐");
        map.put("traffic", "交通");
        map.put("home", "家用");
        map.put("snacks", "零食/饮料");
        map.put("fruit", "水果");
        map.put("WaterAndElectricity", "水电费");

        map.put("extra","撸羊毛");
        map.put("redPackets","红包");
        map.put("salary","工资");

        map.put("in","收入");
        map.put("out","支出");

        map.put("czk","陈泽楷");
        map.put("lmx","卢敏炫");
        map.put("together","共同");

    }

    public static Boolean isContains(String x){
        return map .containsKey(x);
    }
    public static String get(String x){
        return map .get(x);
    }
}
