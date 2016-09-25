package com.sabre.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;

public class TimerProcessor implements org.aopalliance.intercept.MethodInterceptor  {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Method method = invocation.getMethod();
		Annotation anno = method.getDeclaredAnnotation(TimeWatch.class);
		System.out.println(anno.toString());
		System.out.println(anno.annotationType());
		long start = System.currentTimeMillis();
		invocation.proceed();
		long end = System.currentTimeMillis();
		System.out.println("Time taken by this method: "+(end-start)/1000+" sec");
		return null;
	}

}
