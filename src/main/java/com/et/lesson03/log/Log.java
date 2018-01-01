package com.et.lesson03.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Log {
	Logger logger = Logger.getLogger(Log.class);
	public void beforeFun(JoinPoint jp) {
		logger.debug("前置方法"+jp.getSignature().getName());
	}

	public void afterFun(JoinPoint jp) {
		logger.debug("后置方法"+jp.getSignature().getName());
	}

	public void throwFun(JoinPoint jp) {
		logger.debug("异常"+jp.getSignature().getName());
	}
}
