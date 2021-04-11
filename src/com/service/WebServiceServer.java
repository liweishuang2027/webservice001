package com.service;
 
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
 
import com.service.HelloWebService;
import com.service.HelloWebServiceImpl;
 
public class WebServiceServer {
	
	public WebServiceServer(){
		
		//create an web service interface
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		
		//release the web service
		factory.setAddress("http://localhost:8080/webservice001");
		
		//register the web service
		factory.setServiceClass(HelloWebService.class);
		factory.setServiceBean(new HelloWebServiceImpl());
		
		//create the service
		factory.create();
		
		//use another method to start web service
		//Endpoint.publish("http://localhost:8080/hellowebservice", new HelloWebServiceImpl());
	}
	
	public static void main(String[] args) {
		new WebServiceServer();
		System.out.println("server is ready...");
		try {
			Thread.sleep(1000*300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("server exit...");
		System.exit(0);
	}
}