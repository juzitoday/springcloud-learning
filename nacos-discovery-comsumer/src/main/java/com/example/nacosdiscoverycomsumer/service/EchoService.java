package com.example.nacosdiscoverycomsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("nacos-discovery-provider-sample")
public interface EchoService {

    @GetMapping("/echo/{message}")
    String echo(@PathVariable("message") String message);
}
