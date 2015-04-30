package com.isban.spring.AOP_Before_After;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

import com.isban.spring.AOP_Before_After.bean.Operacion;
public class Test{  
    public static void main(String[] args){  
        ApplicationContext context = 
        new ClassPathXmlApplicationContext("com/isban/spring/AOP_Before_After/config/spring-context.xml");  
        Operacion e = (Operacion) context.getBean("operacion");  
        
        /*before*//*After*/
        System.out.println("llamando msg...");  
        e.msg();  
        System.out.println("llamando m...");  
        e.m();  
        System.out.println("llamando k...");  
        e.k();
    }  
}  
