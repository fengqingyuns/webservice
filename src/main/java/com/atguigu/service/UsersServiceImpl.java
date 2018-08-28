package com.atguigu.service;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.alibaba.fastjson.JSON;
import com.atguigu.bean.User;

public class UsersServiceImpl implements UserServiceInf{

	public String sayHello(String say) {
		// TODO Auto-generated method stub
		return null;
	}


	@Produces("application/json")
	@Consumes("application/x-www-form-urlencoded")
	@Path("rest")
	@POST
	public String gogogo(@BeanParam User user){
		//①.对象转Json: JSON.toJSONString(Object object);
		User users = new User(0,"0");
		users.setId(1);
		users.setName("nihao");
		System.out.println("qqq");
		return JSON.toJSONString(users);
	}
	
}
