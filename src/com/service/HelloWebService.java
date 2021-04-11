package com.service;
 
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
 
@WebService
public interface HelloWebService {
 
	@WebMethod
	@WebResult(name="SayHellowRet")
	public String sayHello(@WebParam(name="UserName")String name);
}