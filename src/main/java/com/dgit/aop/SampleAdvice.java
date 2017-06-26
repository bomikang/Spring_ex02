package com.dgit.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SampleAdvice {
	private static final Logger logger = LoggerFactory.getLogger(SampleAdvice.class);
	
//	@Before("execution(* com.dgit.service.MessageService*.*(..))") //MessageService에있는 함수들 //이전실행
//	public void startLog(JoinPoint jp){
//		logger.info("=================================");
//		logger.info("=================================");
//		logger.info(Arrays.toString(jp.getArgs()));
//	}
	
	@Around("execution(* com.dgit.service.MessageService*.*(..))") //before, after때 둘 다 실행
	public Object timeLog(ProceedingJoinPoint pjp) throws Throwable{
		long startTime = System.currentTimeMillis();
		
		Object result = pjp.proceed(); //proxy를 통해 target 메소드를 실행
		
		long endTime = System.currentTimeMillis();
		
		logger.info("=================================");
		logger.info("Time : " + (endTime - startTime));
		logger.info("=================================");
		
		return result;
	}
}
