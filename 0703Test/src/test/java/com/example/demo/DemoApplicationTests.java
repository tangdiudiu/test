package com.example.demo;




import com.alibaba.fastjson.JSONObject;
import io.netty.util.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.CronExpression;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        String SDF = "yyyy-MM-dd";
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 0);
        Date time = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println( sdf.format(time));
        System.out.println("".equals("asd"));
    }

    public String getLastTimeInterval(String sata, int a) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Calendar calendar = Calendar.getInstance();
//        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
//        int offset = 5 - dayOfWeek;
//        calendar.add(Calendar.DATE, offset - 7);
//        String lastEndDate = sdf.format(calendar.getTime());
//        return lastEndDate;
        boolean isSymbol = "asd" != null && "asd".length() > 0;
        System.out.println("asdf");
        return null;
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        // 从键盘接收数据
//
//        // next方式接收字符串
//        System.out.println("next方式接收：");
//        // 判断是否还有输入
//        if (scan.hasNext()) {
//            String str1 = scan.next();
//            System.out.println("输入的数据为：" + str1);
//        }
//
//        JSONObject json = new JSONObject();
//        json.put("target",1);
//        System.out.println(json);
        boolean a =  StringUtil.isNullOrEmpty("") && StringUtil.isNullOrEmpty("");
        System.out.println(a);

    }

@Test
    public  void cronTest() {
        try {
            CronExpression exp = new CronExpression("0 0 0/1 * * ?");
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = new Date();
            int i = 0;
            // 循环得到接下来n此的触发时间点，供验证
            while (i < 14) {
                d = exp.getNextValidTimeAfter(d);
                System.out.println(df.format(d));
                ++i;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public  void kkk() {
//        List<Integer> SETTING_FLAG_STATUS = Arrays.asList(1,2);
//
//        System.out.println(SETTING_FLAG_STATUS.contains(1));

       boolean a =  StringUtil.isNullOrEmpty("") && StringUtil.isNullOrEmpty("");
        System.out.println(a);
    }




}
