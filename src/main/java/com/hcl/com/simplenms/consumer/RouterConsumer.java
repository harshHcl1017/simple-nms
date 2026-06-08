package com.hcl.com.simplenms.consumer;

import com.hcl.com.simplenms.model.Router;
import com.hcl.com.simplenms.service.RouterService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RouterConsumer {

    private final RouterService service;

    public RouterConsumer(RouterService service) {
        this.service = service;
    }

    @KafkaListener(
            topics = "router-metrics",
            groupId = "simple-nms-group"
    )
    public void consume(Router router) {

        System.out.println(
                "Received Router Data: "
                        + router.getRouterId()
        );

        service.save(router);
    }
}
