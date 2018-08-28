package com.atguigu.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class UserController {

	@RequestMapping("/indexs")
	public String ddd(){
		System.out.println("...");
		return "";
	}
}
