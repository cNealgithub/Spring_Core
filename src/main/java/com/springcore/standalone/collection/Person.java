package com.springcore.standalone.collection;

import java.util.List;

public class Person {
    private String pName;
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

    @Override
    public String toString() {
        return "Person{" +
                "pName='" + pName + '\'' +
                ", friends=" + friends +
                '}';
    }
}
