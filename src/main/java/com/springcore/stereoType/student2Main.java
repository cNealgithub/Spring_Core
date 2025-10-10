package com.springcore.stereoType;

import org.example.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class student2Main {
    public static void main(String[] args){
        ApplicationContext con = new ClassPathXmlApplicationContext("stereoConfig.xml");
        Student2 s1 = con.getBean("student2", Student2.class);
        System.out.println(s1);
        List<String> ad = s1.getAddresses();
        System.out.println(ad);
        System.out.println("type of address" + s1.getAddresses().getClass().getName());
        System.out.println(s1.hashCode());
        Student2 s2 = con.getBean("student2", Student2.class);
        System.out.println(s2.hashCode());
    }
}
