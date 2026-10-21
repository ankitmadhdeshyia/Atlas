package com.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        
        ApplicationContext app=new ClassPathXmlApplicationContext("com/constructorinjection/Ciconfif.xml");
        Person p=(Person)app.getBean("person");
        System.out.println(p);
    }
}

