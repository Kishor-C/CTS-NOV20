package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		ServiceLayerClass service = (ServiceLayerClass)context.getBean("serviceLayerClass");
		service.store();
	}

}
