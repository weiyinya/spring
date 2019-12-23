package com.wy.learning.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author weiyin
 * @date 2019-12-23 14:50
 */
public class Advice2 implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("advice2 before");
		Object result = invocation.proceed();
		System.out.println("advice2 after");
		return result;
	}
}
