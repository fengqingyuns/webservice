package com.atguigu.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tests {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	
		  String temp = "2016-06-20 22:49:02.967";
		  Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(temp);
		  System.out.println(date.after(new Date()));
	}
	
	

}
