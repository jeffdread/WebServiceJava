package com.formation.client;

import com.formation.ws.HelloWorld;
import com.formation.ws.HelloWorldImplService;

public class HelloWorldClient {

	public static void main(String[] args) {
		
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();
		System.out.println(hello.sayHello("toto"));
	}

}
