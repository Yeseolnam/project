package com.frame;

import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {
	public void logger(JoinPoint jp,Object obj) {
		System.out.println("-----------------------------------------");
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
		System.out.println(obj.toString());
		System.out.println("-----------------------------------------");
	}
}



