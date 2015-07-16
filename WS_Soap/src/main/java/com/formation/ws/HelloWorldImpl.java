package com.formation.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.formation.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHello(String nom) {
		return "Hello World JAX-WS "+nom;
	}

}