package com.atguigu.util;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import redis.clients.jedis.Jedis;

public class Jides {
	
	public static void main(String[] args) {
		 
		 Map map = new HashMap();
		 map.put("k1", "a");
		 map.put("k2", "2");
		
		 Jedis je = new Jedis("192.168.96.128");
		 je.zadd("k2", 2,"22");
		
	}

	
	 
}
