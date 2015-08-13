package com.artidemo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.artidemo.request.Request;

@SpringBootApplication
@ComponentScan("com.artidemo.*")
public class ArtiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtiDemoApplication.class, args);
        try {
			doCmd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public static void doCmd() throws Exception {
		Request request = new Request();
		String result = (String) request.getBuild("abc");
		System.out.println(result);
	}
}
