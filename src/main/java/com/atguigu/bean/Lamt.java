package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.ws.security.util.StringUtil;

public class Lamt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<User> list = new ArrayList<User>();
		 	User user = null;
	        for (int i = 0; i < 10; i++) {
	        	user = new User(i,"a"+i);
	        	user.setId(i);
	            list.add(user);
	        }
	        
	        list.stream().filter(temp -> temp.getId()!=1).forEach(usertemp -> {System.out.print(usertemp.getId()+" ");});
    }

}
