package com.artidemo.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import com.artidemo.request.Request;
import com.artidemo.request.interceptor.AuthenticationInterceptor;

@Configuration
public class AppConfig {



	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		final List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add( new AuthenticationInterceptor( "admin", "password" ) );
        restTemplate.setInterceptors( interceptors );

		return restTemplate;
	}

	@Bean()
	public Request request() {

		return new Request();
	}
}
