package com.wy.learning.aop;

import com.wy.learning.aop.advice.Advice1;
import com.wy.learning.aop.advice.Advice2;
import com.wy.learning.interf.TestInterface;
import com.wy.learning.interf.TestInterfaceImpl;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author weiyin
 * @date 2019-12-23 14:37
 */
public class Testt {

	@Test
	public void test01(){
		ProxyFactory factory = new ProxyFactory(new TestInterfaceImpl());
		factory.addInterface(TestInterface.class);
		factory.addAdvice(new Advice1());
		factory.addAdvice(new Advice2());

		TestInterface pojo = (TestInterface) factory.getProxy();
		// this is a method call on the proxy!
		pojo.test();
	}
}
