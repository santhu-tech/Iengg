package com.iEngg.Kafka_stream_wordcount.Processor;

import org.apache.kafka.streams.processor.api.Processor;
import org.apache.kafka.streams.processor.api.ProcessorSupplier;

public class WordCountSupplier implements ProcessorSupplier<String ,String,String,String> {

    @Override
    public Processor<String, String, String, String> get() {
        return new WordCountProcessor();
    }
}
