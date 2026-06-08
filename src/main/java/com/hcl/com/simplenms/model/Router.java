package com.hcl.com.simplenms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Router {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String routerId;
    private String ipAddress;
    private int activeConnections;
    private double cpuUsage;
    private double memoryUsage;
    private String status;
    private LocalDateTime timestamp;
}
