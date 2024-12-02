/*package com.CT.Ecommerce.Config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.kafka.listener.MessageListenerContainer;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
public class KafkaListenerConfig {

    // Common consumer configurations
    private Map<String, Object> consumerConfigs(String groupId) {
        Map<String, Object> consumerProps = new HashMap<>();
        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        consumerProps.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
        return consumerProps;
    }

    // Consumer Factory for Group 1
    @Bean
    public ConsumerFactory<String, String> group1ConsumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs("group1"));
    }

    // Listener Factory for Group 1
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> group1ListenerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(group1ConsumerFactory());
        factory.setConcurrency(3); // Set the number of consumers for group1
        return factory;
    }

    // Consumer Factory for Group 2
    @Bean
    public ConsumerFactory<String, String> group2ConsumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs("group2"));
    }

    // Listener Factory for Group 2
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> group2ListenerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(group2ConsumerFactory());
        factory.setConcurrency(2); // Set the number of consumers for group2
        return factory;
    }

}*/