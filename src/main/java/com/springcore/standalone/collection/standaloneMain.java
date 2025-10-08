package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class standaloneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext con = new ClassPathXmlApplicationContext("aloneConfig.xml");
        Person p1 = con.getBean("person1", Person.class);
        Person p2 = con.getBean("person2", Person.class);
        System.out.println(p1);
        System.out.println(p2);
	}

}
