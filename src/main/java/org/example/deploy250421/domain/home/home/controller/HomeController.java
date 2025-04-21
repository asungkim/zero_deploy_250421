package org.example.deploy250421.domain.home.home.controller;

import lombok.RequiredArgsConstructor;
import org.example.deploy250421.domain.home.home.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping
    public String home() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        return homeService.hello() + address.getHostName() + "," + address.getHostAddress();
    }
}
