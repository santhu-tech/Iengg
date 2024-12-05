package com.iEngg.Kafka_stream_wordcount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@SpringBootApplication
@EnableKafka
@EnableKafkaStreams
public class KafkaStreamWordcountApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamWordcountApplication.class, args);
	}

}
