package okcoin.example.demo.bean;


import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    private int age;
    private String name;
    private String sex;

}
