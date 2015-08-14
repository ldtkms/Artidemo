package com.artidemo.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.artidemo.core.AppConstant;
import com.artidemo.model.Artifact;


/**
 * @author tuyenlieu
 *			This class represents atomic request to Artifactory server
 */
@Component
public class Request {

	@Autowired 
	public RestTemplate restTemplate;
	
	String url;
	
	public Request() {
		url = AppConstant.URL;
	}
	
	public Artifact getArtifact(String target) {
		return null;
		
	}
	
	public void putArtifact(String source) {
		
	}
	
	public void appendURL(String appendee) {
		url = url + appendee;
	}
	
	public String getBuild(String buildName) {
 		String result = restTemplate.getForObject(url, String.class);
		return result;
	}
	
	
}
