package com.springcore.noXML;

import org.springframework.stereotype.Component;

//@Component("std") //we will nsted use @bean annotation in the javaConfig class
public class Student3 {
    //creating dependency of Samosa class in Student3 class
    private Samosa samosa;
    public void study(){
        System.out.println("Student is studying");
        samosa.display();
    }

    public Student3(Samosa samosa) {
        this.samosa = samosa;
    }
}
