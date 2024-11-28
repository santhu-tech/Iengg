package com.iEngg;

import com.iEngg.dto.Customer;
import com.iEngg.service.KafkaMessagePublisher;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertNotNull;
import static org.awaitility.Awaitility.await;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
public class KafkaProducerTests {
        @Container
        static KafkaContainer kafka = new KafkaContainer(DockerImageName.parse("apache/kafka:latest")); // Replace with desired version

        @DynamicPropertySource
        public static void initKafkaProperties(DynamicPropertyRegistry registry) {
            registry.add("spring.kafka.bootstrap-servers", kafka::getBootstrapServers);
        }

        @Autowired
        private KafkaMessagePublisher publisher;

        @Autowired
        private KafkaConsumer<String, String> kafkaConsumer; // Assuming a consumer is configured

        @Test
        public void testSendEventsToTopic() {
            String customerString = "263,test user,test@gmail.com,564782542752";
            publisher.sendEventsToTopic(customer);

            await().pollInterval(Duration.ofSeconds(3))
                    .atMost(10, TimeUnit.SECONDS).untilAsserted(() -> {
                        ConsumerRecord<String, String> record = KafkaTestUtils.getSingleRecord(
                                kafkaConsumer, "your-topic", s -> s.equals(customerString), 10, TimeUnit.SECONDS);
                        assertNotNull(record);
                    });
        }
    }

