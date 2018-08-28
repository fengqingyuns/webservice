package com.atguigu.webservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.atguigu.bean.User;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.atguigu.bean.User;
import com.google.gson.Gson;

public class RestFulService {

	public static void main(String[] args) {
		try {
			getCode("11","xw");
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String getCode(String phonenum,String msg) throws ClientProtocolException, IOException{
		//创建 HttpClient 的实例
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		//创建post连接方法的实例
		HttpPost httpPost = new HttpPost("http://localhost:8083/Webservice/rest/rest");
		//需要传入entity参数而参数里面的类型是HttpEntity类型，所以new一个出来，而httpEntity需要传一个			NameValuePair泛型的List,所以list.add(new NameValuePair的一个实现类). 
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		list.add(new BasicNameValuePair("id",phonenum));
		list.add(new BasicNameValuePair("name",msg));
		HttpEntity en = new UrlEncodedFormEntity(list,"utf-8");
		httpPost.setEntity(en);
		//读response获取
		HttpResponse res = httpClient.execute(httpPost);
		HttpEntity entity = res.getEntity();
		if(res.getStatusLine().getStatusCode()==HttpStatus.SC_OK){
			String result = EntityUtils.toString(entity,"utf-8");
			System.out.println(result);
			Gson gson = new Gson();
			User user = gson.fromJson(result, User.class);
			System.out.println(user.getName());
		}else{
			System.out.println("11");
		}
		EntityUtils.consume(en);
		httpClient.close();
		return "a";
	}




}
