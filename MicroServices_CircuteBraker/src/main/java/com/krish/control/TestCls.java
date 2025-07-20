package com.krish.control;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class TestCls {

    @GetMapping("/Api")
    @CircuitBreaker(name = "externalApiCircuitBreaker", fallbackMethod = "GetFallBackMeth")
    public String getDats() {
        if (new Random().nextInt(20) < 10) 
            throw new RuntimeException("Api Failed");
        return "Getting from rest controller";
    }

    public String GetFallBackMeth(Throwable t) {
        return "Fall Back Method: " + t.getMessage();
    }
}
