package com.fwd.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="sleuth-gateway", fallback=TestClientHystrix.class)
public interface TestClient {

	@RequestMapping(method=RequestMethod.GET, value="/server2/s2")
	public String server2();
}
