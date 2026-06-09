package com.hcl.com.simplenms.repository;

import com.hcl.com.simplenms.model.Router;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RouterRepository extends JpaRepository<Router, String> {

    List<Router> findByRouterId(String s);

    List<Router> findByStatus(String status);

    List<Router> findByCpuUsageGreaterThan(double cpuUsage);

}
