package com.CT.Ecommerce.Config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {
    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        return new KafkaAdmin(configs);
    }

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



