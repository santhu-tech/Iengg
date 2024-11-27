package com.kafka.transcation.CT_Transcation.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
    public class KafkaTopicConfig {

        @Bean
        public NewTopic transactionTopic() {
            return new NewTopic("transaction-topic", 3, (short) 1);
        }
}


