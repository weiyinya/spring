package com.wy.learning.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author weiyin
 * @date 2019-12-23 14:50
 */
public class Advice1 implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("advice1 before");
//		Object result = invocation.proceed();
		Object result = invocation.getMethod().invoke(invocation.getThis(), invocation.getArguments());
		System.out.println("advice1 after");
		
		return result;
	}
}
