package com.fwd.feignclient;

import org.springframework.stereotype.Component;

@Component
public class TestClientHystrix implements TestClient{

	@Override
	public String server2() {
		return "server2 is not available";
	}

	@Override
	public String server3() {
		return "server3 is not available";
	}

}
