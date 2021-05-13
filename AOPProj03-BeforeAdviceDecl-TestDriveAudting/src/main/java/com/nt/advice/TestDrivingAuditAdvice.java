package com.nt.advice;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class TestDrivingAuditAdvice {
	public void testDriving(JoinPoint jp)throws Exception{
		System.out.println("TestDrivingAuditAdvice.testDriving()");
		Object [] ob=jp.getArgs();
		String msg=ob[0]+"customer has come for test driving of "+ob[1]+"model car on "+new Date();
		Writer writer=new FileWriter("e:\\testDrive.txt",true);
		writer.write(msg+"\n");
		writer.flush();
		writer.close();
	}
}
