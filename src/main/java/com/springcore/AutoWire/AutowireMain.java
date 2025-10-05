package com.springcore.AutoWire;

import com.springcore.AutoWire.ViaXml.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autoConfig.xml");
        Library l1 = context.getBean("library", Library.class);//we can also do typecasting here.
        System.out.println(l1);
    }
}
