package com.springcorecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appl {
    public static void main(String[] args) {
    
    ApplicationContext context=new ClassPathXmlApplicationContext("com/springcorecollection/configu.xml");
    Emp em=(Emp)context.getBean("emp1");
    System.out.println(em);
        
    }
}
