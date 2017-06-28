package com.fwd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fwd.feignclient.TestClient;

@RestController
@EnableAutoConfiguration
@Configuration
public class TestController {

	@Autowired
	TestClient testClient;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@RequestMapping(value="/hi")
	public String hi(){
		return restTemplate.getForObject("http://localhost:8204/s2",String.class);
	}
	
	@RequestMapping(value="/s1")
	public String server1(){
		return "I am SERVER1";
	}
	
	@RequestMapping(value="/s12")
	public String server12(){
		return testClient.server2();
	}
	
}
