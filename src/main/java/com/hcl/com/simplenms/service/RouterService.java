package com.hcl.com.simplenms.service;

import com.hcl.com.simplenms.model.Router;
import com.hcl.com.simplenms.repository.RouterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouterService {

    private final RouterRepository repository;

    public RouterService(RouterRepository repository) {
        this.repository = repository;
    }

    public List<Router> getAllRouters() {
        return repository.findAll();
    }

    public void save(Router router) {
        repository.save(router);
    }

}
