package com.atguigu.util;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class Util {

	public static void main(String[] args) throws ParseException {
		  String temp = "2016-06-20 22:49:02.967";
		//temp = temp.substring(0,aaa.lastIndexOf("."));
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(temp);
		 DateTime dtdate = new DateTime(date);
		 System.out.println(dtdate.plusMinutes(-2).toDate());
		String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		System.out.println("==== this time ==="+str);       
		    
	}
}
