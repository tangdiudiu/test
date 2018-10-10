package okcoin.example.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testlmada {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        // 直接打印
//        list.forEach(System.out::println);
//        // 取值分别操作
////        list.forEach(i -> {
////            System.out.println(i * 3);
////        });
//
//        String a ="sadas";
//        a.equals("");
//        list.forEach(a::equals);
//        list.forEach(a::equals);
        Map<String, Integer> map = null;
      Map<Integer, String> mapKey = null;
         Map<Long, Integer> seconds = null;
            map = new HashMap<>();
            map.put("1min", 0); // 0:1分钟
            map.put("3min", 7); // 7:3分钟
            map.put("5min", 1); // 1:5分钟
            map.put("15min", 2);// 2:15分钟
            map.put("30min", 9);// 9:30分钟
            map.put("1day", 3); // 3:日
            map.put("day", 3); // 3:日
            map.put("3day", 15);// 15：3日
            map.put("1week", 4);// 4:周
            map.put("week", 4);// 4:周
            //map.put("1month", 5); // 5:月
            //		map.put("1year", 6);// 6:年
            map.put("1hour", 10); // 10:1小时
            map.put("2hour", 11); // 11:2小时
            map.put("4hour", 12); // 12:4小时
            map.put("6hour", 13); // 13:6小时
            map.put("12hour", 14); // 14:12小时

            mapKey = new HashMap<Integer, String>();
            mapKey.put(0, "1min"); // 0:1分钟
            mapKey.put(7, "3min"); // 7:3分钟
            mapKey.put(1,"5min"); // 1:5分钟
            mapKey.put(2,"15min");// 2:15分钟
            mapKey.put(9,"30min");// 9:30分钟
            mapKey.put(3,"day"); // 3:日
            mapKey.put(15,"3day");// 15：3日
            mapKey.put(4,"week");// 4:周
            mapKey.put(10,"1hour"); // 10:1小时
            mapKey.put(11,"2hour"); // 11:2小时
            mapKey.put(12,"4hour"); // 12:4小时
            mapKey.put(13,"6hour"); // 13:6小时
            mapKey.put(14,"12hour"); // 14:12小时

            seconds = new HashMap<>();
            seconds.put(60L, 0); // 0:1分钟
            seconds.put(180L, 7); // 7:3分钟
            seconds.put(300L, 1); // 1:5分钟
            seconds.put(900L, 2);// 2:15分钟
            seconds.put(1800L, 9);// 9:30分钟
            seconds.put(3600L, 10); // 10:1小时
            seconds.put(7200L, 11); // 11:2小时
            seconds.put(14400L, 12); // 12:4小时
            seconds.put(21600L, 13); // 13:6小时
            seconds.put(43200L, 14); // 14:12小时
            seconds.put(86400L, 3); // 3:日
            seconds.put(604800L, 4);// 4:周
        long granularityCount = Long.parseLong("180");

        System.out.println(seconds.get(granularityCount));

    }
}
