package com.sabre.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Component
public class TimerTest {

	//@Autowired
	//static MyEntity entity;
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		MyEntity entity = (MyEntity) context.getBean("myEntityProxy");
		entity.display();
		
		
		
	}

}
