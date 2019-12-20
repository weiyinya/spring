package com.wy.learning.interf;

import org.springframework.stereotype.Component;

/**
 * @author weiyin
 * @date 2019-12-11 16:41
 */
@Component
public class TestInterfaceImpl implements TestInterface {
	@Override
	public void test() {
		System.out.println("test");
	}
}
