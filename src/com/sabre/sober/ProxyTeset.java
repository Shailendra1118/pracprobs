package com.sabre.sober;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.AopContext;
import org.springframework.aop.framework.ProxyFactory;

public class ProxyTeset {
	 public static void main(String[] args) {

	        ProxyFactory factory = new ProxyFactory(new SimplePojo());
	        factory.addInterface(Pojo.class);
	        factory.addAdvice(new RetryAdvice());
	        factory.setExposeProxy(false);

	        Pojo pojo = (Pojo) factory.getProxy();

	        // this is a method call on the proxy!
	        pojo.foo();
	    }
}

class RetryAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Retry advice executed.");
		return null;
	}
	
}

interface Pojo{
	void foo();
	void bar();
}
class SimplePojo implements Pojo{
	public void foo(){
		System.out.println("some code in foo method");
		//this.bar();
		((Pojo) AopContext.currentProxy()).bar();
	}
	
	public void bar(){
		System.out.println("some code in bar method");
	}
}