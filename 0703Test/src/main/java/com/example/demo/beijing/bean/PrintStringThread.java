package com.example.demo.beijing.bean;

import org.junit.Test;

import java.util.List;

public class PrintStringThread implements Runnable{
    private int num;

    private List<String> strList;

    private int threadNum;

    public PrintStringThread(int num, List<String> strList, int threadNum) {
        this.num = num;
        this.strList = strList;
        this.threadNum = threadNum;
    }
    public void run() {
        int length = 0;
        for(String str : strList){
            if (length % threadNum == num) {
                System.out.println("线程编号：" + num + "，字符串：" + str);
            }
            length ++;
        }
    }
}
