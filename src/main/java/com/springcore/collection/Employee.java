package com.springcore.collection;
import java.util.*;

public class Employee {
    private int empId;
    private String empName;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;
    private Properties prop;
    //getter and setters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public Employee(){
        super();
    }

    public Employee(int empId, String empName, List<String> phones, Set<String> addresses, Map<String, String> courses, Properties prop) {
        this.empId = empId;
        this.empName = empName;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.prop = prop;
    }
}
