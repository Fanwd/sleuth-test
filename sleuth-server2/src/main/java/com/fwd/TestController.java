package com.fwd;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@Configuration
public class TestController {

	@RequestMapping(value="/s2")
	public String hi(){
		return "I am SERVER2";
	}
}
