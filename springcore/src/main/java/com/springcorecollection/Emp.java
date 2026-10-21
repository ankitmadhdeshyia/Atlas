package com.springcorecollection;

import  java.util.*;

public class Emp{
  public Emp(String name, List<String> number, Set<String> address, Map<String, String> courses) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.courses = courses;
    }
  private String name;
  private List<String> number;
  private Set<String> address;
  private Map<String ,String> courses;
  @Override
  public String toString() {
    return "Emp [name=" + name + ", number=" + number + ", address=" + address + ", courses=" + courses + "]";
  }
  public Emp() {
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public List<String> getNumber() {
    return number;
  }
  public void setNumber(List<String> number) {
    this.number = number;
  }
  public Set<String> getAddress() {
    return address;
  }
  public void setAddress(Set<String> address) {
    this.address = address;
  }
  public Map<String, String> getCourses() {
    return courses;
  }
  public void setCourses(Map<String, String> courses) {
    this.courses = courses;
  }
}
