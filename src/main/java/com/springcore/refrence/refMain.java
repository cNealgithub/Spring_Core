package com.springcore.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class refMain {
    public static void main(String[] args){
        ApplicationContext context =  new ClassPathXmlApplicationContext("refConfig.xml");
        A a = (A) context.getBean("aref");
        B b = (B) context.getBean("b");

        System.out.println(a.getX());
        System.out.println(a.getOb().getNum());
        System.out.println("---------------------");
        System.out.println(a);
    }
}
