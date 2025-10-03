package com.springcore.Ci;

import java.util.List;

public class Person {
    private String Name;
    private int personId;
    private Certificate certi;
    private List<String> wearables;

    public Person(String Name, int personId, Certificate certi, List<String> wearables){
        this.Name = Name;
        this.personId = personId;
        this.certi = certi;
        this.wearables = wearables;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", personId=" + personId +
                ", certi=" + certi +
                ", wearables=" + wearables +
                '}';
    }
}

