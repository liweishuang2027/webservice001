package com.service;
 
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
 
import com.service.HelloWebService;
 
public class WebServiceClient {
	public static void main(String[] args) {
		//create a web service proxy factory
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		
		//set the address of web service
		factory.setAddress("http://localhost:8080/webservice001");
		
		//register the web service interface
		factory.setServiceClass(HelloWebService.class);
		
		//get the service bean
		HelloWebService hello = (HelloWebService) factory.create();
		
		//check the result
		System.out.println("invoking service...");
		System.out.println(hello.sayHello("andyChen"));
	}
}