package com.wy.learning.core;

import com.wy.learning.interf.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author weiyin
 * @date 2019-12-11 16:39
 */
@Component
public class Main {
	@Autowired
	private TestInterface testInterface;
}
