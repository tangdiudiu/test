package com.example.demo.beijing.bean;

import com.alibaba.fastjson.JSONObject;

import java.sql.*;

/**
 * Created by wc.jia on 2018/7/12.
 */
public class testMain {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
            System.out.println("加载数据库驱动成功");
            String url = "jdbc:mysql://localhost:3306/test";//声明数据库test的url
            String user = "root";//数据库账号
            String password = "root";//数据库密码
            //建立数据库连接，获得连接对象conn
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("连接数据库成功");
            JSONObject targetJson = new JSONObject();
            targetJson.put("target",3);
            String sql = "update student set name=? where userid=? ";//生成一条mysql语句
            PreparedStatement ps = conn.prepareStatement(sql);//创建PreparedStatement对象
            int count = ps.executeUpdate();//执行sql语句
            System.out.println("修改数据库成功");

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}