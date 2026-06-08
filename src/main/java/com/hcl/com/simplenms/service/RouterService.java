package com.hcl.com.simplenms.service;

import com.hcl.com.simplenms.model.Router;
import com.hcl.com.simplenms.repository.RouterRepository;
import org.springframework.stereotype.Service;

@Service
public class RouterService {

    private final RouterRepository repository;

    public RouterService(RouterRepository repository) {
        this.repository = repository;
    }

    public void save(Router router) {
        repository.save(router);
    }
}
