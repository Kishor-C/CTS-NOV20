package com.org;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDemo {

	// you can have multiple advices inside the aspect
	
	@Before("execution(public void com.org.ServiceLayerClass.store())")
	public void logger() {
		System.out.println("logger method is executed and it an advice");
	}
}
