package com.formation.endpoint;

import javax.xml.ws.Endpoint;

import com.formation.ws.HelloWorldImpl;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7070/ws/hello", new HelloWorldImpl());
		System.out.println("Service deployé");
	}
}