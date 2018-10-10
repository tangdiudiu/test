package com.example.demo.beijing.bean;

import com.alibaba.fastjson.support.odps.udf.CodecCheck;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import java.util.ArrayList;
import java.util.List;

public class testStream {
    @Test
    public void geta(){
        student student1 = new student();
        student1.setAge(12);
        student1.setName("小明");
        student1.setSax("man");
        student student2 = new student();
        student2.setAge(13);
        student2.setName("小红");
        student2.setSax("women");
        student student3 = new student();
        student3.setAge(13);
        student3.setName("小红");
        student3.setSax("women");
        List<student> list = new ArrayList<>();
        //list.a(student1,student2,student3);
    }
}
