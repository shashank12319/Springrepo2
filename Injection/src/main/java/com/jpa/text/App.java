package com.jpa.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/jpa/text/config.xml");
	Student student1=(Student)context.getBean("student1",Student.class);
	System.out.println(student1);
}
}
