package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /* Calendar now = Calendar.getInstance();
		   Date sourceDate = new Date();
		   now.setTime(sourceDate);
	        int year = now.get(Calendar.YEAR);
	        int month = now.get(Calendar.MONTH) + 1;
	        int day = now.get(Calendar.DAY_OF_MONTH);
	        System.out.println(year);
	        System.out.println(month);
	        System.out.println(day);*/
		User u = new User(0,"xw");
		User u1 = new User(1,"xl");
		User u2 = new User(2,"xz");
		User u3 = new User(3,"x");
		List<User> l = new ArrayList();
		l.add(u);
		l.add(u1);
		l.add(u2);
		l.add(u3);
		List<Integer> list = l
				.stream()
				.filter(user ->user.getName().length()>1)
				.map(User::getId)
				.collect(Collectors.toList());
		list.forEach(temp ->System.out.println(temp));
		List a = l.stream().map(User::getId).collect(Collectors.toList());
		System.out.println(a);
		/*User uuu = new User();
		Map<String,User> map = new HashMap<String,User>();
		map.put("a", uuu);
		uuu.setName("aa");
		User user = map.get("a");
		System.out.println("%s%04d");*/
	}

}
