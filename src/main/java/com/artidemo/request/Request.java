package com.artidemo.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.client.RestTemplate;

import com.artidemo.core.AppConstant;
import com.artidemo.model.Artifact;


/**
 * @author tuyenlieu
 *			This class represents atomic request to Artifactory server
 */
@Configurable
public class Request {

	@Autowired 
	private RestTemplate template;
	
	String url;
	
	public Request() {
		url = AppConstant.URL;
	}
	
	public Artifact getArtifact(String target) {
		return null;
		
	}
	
	public void putArtifact(String source) {
		
	}
	
	public Object getBuild(String buildName) {
 		Object result = template.getForEntity(url, String.class);
		return result;
	}
	
	
}
