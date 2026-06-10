package com.hcl.com.simplenms.controller;

import com.hcl.com.simplenms.model.Router;
import com.hcl.com.simplenms.service.RouterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/routers")
@RequiredArgsConstructor
public class RouterNMSController {
    private final RouterService routerService;


    @GetMapping
    public List<Router> getAllRouters() {
        return routerService.getAllRouters();
    }

    @GetMapping("/health")
    public String health() {
        return "SimpleNMS Service is UP";
    }

}
