package com.example.demo.beijing.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mchange.lang.DoubleUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Service;

import javax.naming.Name;
import java.io.IOException;
import java.security.MessageDigest;
import java.sql.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

/**
 * Created by wc.jia on 2018/7/12.
 */
@Service
public class test1 {
    @Value(value = "${spring.datasource.url}")
    private  String url;
    @Value("${spring.datasource.username}")
    private  String user;
    @Value("${spring.datasource.password}")
    private  String password;
    @Value("${spring.datasource.driver-class-name}")
    private  String connect;
    @Value(value = "${book.author}")
    private  String bookAuthor;

    public test1(){
        System.out.print(url);
    }

/*    {
        Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
        System.out.println("加载数据库驱动成功");
        String url = "jdbc:mysql://localhost:3306/test";//声明数据库test的url
        String user = "root";//数据库账号
        String password = "root";//数据库密码
        //建立数据库连接，获得连接对象conn
        Connection conn = DriverManager.getConnection(url, user, password);*/

//   private static Connection conn = null;
//
//    private static Connection addstudent(){
////
//        Properties props = new Properties();
//        try {
//            props= PropertiesLoaderUtils.loadAllProperties("message.properties");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //建立数据库连接，获得连接对象conn

//        try {
//            Class.forName(connect);
//            conn = DriverManager.getConnection(url, user, password);
//            System.out.print(url);
//            System.out.print(user);
//            System.out.print(password);
//            System.out.print(connect);
//
//            String sql = "update student set name=? where userid=? ";//生成一条mysql语句
//            PreparedStatement ps = conn.prepareStatement(sql);//创建PreparedStatement对象
//            ps.setString(1, "admi222n");//为第一个问号赋值
//            ps.setInt(2, 0);//为第二个问号赋值
//            int count = ps.executeUpdate();//执行sql语句
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        System.out.print(conn);
//        return conn;
    //}
    public static void main(String[] args){
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("1","pp");
//        jsonObject.put("2","问");
//        jsonObject.put("3","哦哦");
//        jsonObject.put("1","ppppp");
//        System.out.println(jsonObject);
//
//        Map<String,Object> map = new HashMap<>();
//        map.put("4",21);
//        map.put("5",55);
//        map.put("6",66);
//        map.put("4",56789);
//
//        System.out.println(map);
        String s = UUID.randomUUID().toString();
        System.out.println(s);
        System.out.println(s.replaceAll("[a-z|-]", ""));

    }

    @Test
    public void ssdf() throws Exception{
//        List<Map<String, Object>> list = new ArrayList<>();
//
//        Map<String, Object> map1 = new HashMap<>();
//        map1.put("brokePrice",1.1);
//        Map<String, Object> map2 = new HashMap<>();
//        map2.put("brokePrice",8.1);
//        Map<String, Object> map3 = new HashMap<>();
//        map3.put("brokePrice",5.1);
//        Map<String, Object> map4 = new HashMap<>();
//        map4.put("brokePrice",3.1);
//        list.add(map1);
//        list.add(map2);
//        list.add(map3);
//        list.add(map4);
//        System.out.println(list);
//
//
//        Collections.sort(list, new Comparator<Map<String, Object>>() {
//            @Override
//            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
//                double p1 = Double.parseDouble(o1.get("brokePrice").toString());
//                double p2 = Double.parseDouble(o2.get("brokePrice").toString());
//                return Double.compare(p2, p1);
//            }
//        });
//
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//
//        list.forEach(n-> System.out.println(n));
//
//        list.forEach(System.out::println);



//
//
//        System.out.println(timeStamp2Date("199506182012"));

//        Map<String,String> map = new HashMap<>();
//        map.put("1","21");
//        map.put("2","22");
//        map.put("3","23");
//        map.put("4","24");
//        map.put("5","25");
//        map.put("6","26");
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
////        for (Map.Entry<String, String> entry : map.entrySet()){
////            System.out.println(entry.getValue());
////        }
//        System.out.println(map.entrySet().iterator().next()+"____");
//        System.out.println(iterator.next().getKey());
//        while (iterator.hasNext()) {
//                iterator.remove();
//            System.out.println(map);
//            //System.out.println(iterator.next().getKey());
//        }
//        System.out.println(map.toString());

//        String a =  "qweqwer12312";
//       String[] b = a.split("_");
//        System.out.println(b[0]);


        // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        // df.setTimeZone(TimeZone.getTimeZone("UTC"));
        // System.out.println(df.parse("2014-08-23T09:20:05Z").toString());

//        String string = "2016-10-24 21:59:06";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.parse(string));
//
//
//        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        Date t = new Date();
//        System.out.println(t);
//        df1.setTimeZone(TimeZone.getTimeZone("UTC"));
//
//        System.out.println(df1.format(t));
//
//        //System.out.println(sdf.parse(df1.format(t)));
//
//
//        System.out.println(df1.format(sdf.parse(string)));
        //System.out.println(df1.format(sdf.parse(t.toString())));

//        System.out.println((df1.format("2018-09-03 16:42:34")));
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        df1.setTimeZone(TimeZone.getTimeZone("UTC"));
//        System.out.println(df1.format(sdf.parse(string)));

//        String strhours = String.valueOf(123456);
//        String strh = strhours.substring(strhours.length() -2,strhours.length());   //截取
//        String strm = strhours.substring(0,strhours.length()-2);   //截掉
//
//        System.out.println(strh);
//        System.out.println(strm);
//        long  a = 201803090000012L;
//        System.out.println(a%100);


  double a = 999999999999.9999999999999D;
        System.out.println(1/0);


    }

    public static String timeStamp2Date(String time) {
        Long timeLong = Long.parseLong(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//要转换的时间格式
        Date date;
        try {
            date = sdf.parse(sdf.format(timeLong));
            System.out.println(date+"----");
            System.out.println(new Date());
            return sdf.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}