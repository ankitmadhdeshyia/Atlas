package com.springcoreLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcoreLifecycle/config.xml");
        Ankit ank=(Ankit)context.getBean("ank");
        System.out.println(ank);

        context.registerShutdownHook();
    }
}
