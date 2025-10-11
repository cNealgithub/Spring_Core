package com.springcore.noXML;

import org.example.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Student3Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        Student3 s1 = context.getBean("student3", Student3.class);
        s1.study();
    }
}
