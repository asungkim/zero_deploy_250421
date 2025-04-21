package org.example.deploy250421.domain.home.home.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public HomeService() throws InterruptedException {
        Thread.sleep(10000);
    }

    public String hello() {
        return "Hello World";
    }
}
