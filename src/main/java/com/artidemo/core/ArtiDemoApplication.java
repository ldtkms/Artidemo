package com.artidemo.core;

import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;

import com.artidemo.request.Request;

@SpringBootApplication
@ComponentScan("com.artidemo.*")
public class ArtiDemoApplication {
	
    private static ConfigurableApplicationContext context;

	public static void main(String[] args) {
        context = SpringApplication.run(ArtiDemoApplication.class, args);
        try {
			doCmd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public static void doCmd() throws Exception {
		Request request = context.getBean(Request.class); 
		request.appendURL("build/TuyenProj - BuildUp - Default Job/8");
		String result = request.getBuild("abc");
		System.out.println(result);
	}
	
	// Get authenthication key
	public static void doLogin() throws Exception {
	
		
		
	}
}
