package com.springcore.Ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiTest {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("CiConfig.xml");
        Person p1 = (Person) context.getBean("PersonCi");
        System.out.println(p1);

//        Animal a1 =(Animal) context.getBean("animals");
//        System.out.println(a1);
    }
}
