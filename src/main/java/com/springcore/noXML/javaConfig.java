package com.springcore.noXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.noXML")
public class javaConfig {

    @Bean
    public Samosa samosa(){
        return new Samosa();
    }
    @Bean
    public Student3 student3(){
        Student3 student3 = new Student3(samosa());
        return student3; //we will return a new object of Student3 class
    }
}
