package com.CT.Ecommerce.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic ordersTopic() {
        return TopicBuilder.name("orders").partitions(3).replicas(3).build();
    }

    @Bean
    public NewTopic inventoryTopic() {
        return TopicBuilder.name("inventory").partitions(2).replicas(3).build();
    }

    @Bean
    public NewTopic paymentsTopic() {
        return TopicBuilder.name("payments").partitions(4).replicas(3).build();
    }

    @Bean
    public NewTopic notificationsTopic() {
        return TopicBuilder.name("notifications").partitions(1).replicas(3).build();
    }
}

