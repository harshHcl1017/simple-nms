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

    public List<Router> getRouterById(String routerId) {
        return repository.findByRouterId(routerId);
                /*Collections.singletonList(
                repository.findByRouterId(routerId)
                        .orElseThrow(() ->
                                new RuntimeException("Router not found")));*/
    }

    public List<Router> getByStatus(String status) {
        return repository.findByStatus(status);
    }

    public List<Router> getByCPU() {
        return repository.findByCpuUsageGreaterThan(80.00);
    }

    public void save(Router router) {
        repository.save(router);
    }
}
