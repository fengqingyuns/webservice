package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

/**
 * <pre>
 *                             _ooOoo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            O\  =  /O
 *                         ____/`---'\____
 *                       .'  \\|     |//  `.
 *                      /  \\|||  :  |||//  \
 *                     /  _||||| -:- |||||-  \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |   |
 *                     \  .-\__  `-`  ___/-. /
 *                   ___`. .'  /--.--\  `. . __
 *                ."" '<  `.___\_<|>_/___.'  >'"".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
 *          ======`-.____`-.___\_____/___.-`____.-'======
 *                             `=---='
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 *
 *                     佛祖保佑        永无BUG
 *
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 * </pre>
 * 
 * @date 2018年6月6日
 * 
 *
 * @author litao@hanyun.com
 */
public class MyDate {

	public static void main(String[] args) {
		User user = new User(1, "小王");
		Inner in = new Inner();
		in.setId("11");
		in.setValue("aa");
		List<Inner> list = new ArrayList<>();
		list.add(in);
		user.setInnerList(list);
		JSONObject fromObject = JSONObject.fromObject(user);
		String string = fromObject.toString();
		System.out.println(string);
	}
}
