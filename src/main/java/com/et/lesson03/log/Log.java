package com.et.lesson03.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Log {
	Logger logger = Logger.getLogger(Log.class);
	public void beforeFun(JoinPoint jp) {
		logger.debug("ǰ�÷���"+jp.getSignature().getName());
	}

	public void afterFun(JoinPoint jp) {
		logger.debug("���÷���"+jp.getSignature().getName());
	}

	public void throwFun(JoinPoint jp) {
		logger.debug("�쳣"+jp.getSignature().getName());
	}
}
