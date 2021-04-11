package com.service;
 
import javax.jws.WebService;
 
@WebService(endpointInterface="com.service.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService{
 
	public String sayHello(String name) {
		return "hello " + name;
	}
}