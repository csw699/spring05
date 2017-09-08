package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.model.Dept;

public class SpringExample {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:/spring/beans.xml");
		
		Dept dept = ctx.getBean(Dept.class);
		System.out.println(dept);
		
		ctx.close();
		
	}

}
