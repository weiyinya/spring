package com.wy.learning.interf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author weiyin
 * @date 2019-12-24 16:24
 */
@Component
public class BInterfaceImpl implements BInterface {
	@Autowired
	private AInterface aInterface;
}
