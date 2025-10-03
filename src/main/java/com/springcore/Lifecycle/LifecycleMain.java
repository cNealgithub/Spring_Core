package com.springcore.Lifecycle;

import com.springcore.Lifecycle.viaXML.Samosa;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleMain {
    public static void main(String[] args){
        // to see the destroy method's body we need the shutdownhook method which we will get in "AbstractApplicationContext" class
        AbstractApplicationContext contect = new ClassPathXmlApplicationContext("LifecycleConfig.xml");
        Samosa s1 =(Samosa) contect.getBean("samosa");
        System.out.println(s1);
        contect.registerShutdownHook();
    }
}
