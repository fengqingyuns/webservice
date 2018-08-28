package com.atguigu.service;

public class UserServiceImp implements UserServiceInf{

	public String sayHello(String say) {
		// TODO Auto-generated method stub
		System.out.println("hello"+say);
		return "pong";
	}

}
