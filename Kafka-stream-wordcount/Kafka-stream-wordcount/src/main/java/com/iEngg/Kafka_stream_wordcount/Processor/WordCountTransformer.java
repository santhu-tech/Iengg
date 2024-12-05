package com.iEngg.Kafka_stream_wordcount.Processor;

import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.Transformer;
import org.apache.kafka.streams.processor.ProcessorContext;
import org.apache.kafka.streams.processor.api.Processor;
import org.apache.kafka.streams.processor.api.Record;
import org.apache.kafka.streams.state.KeyValueStore;
public class WordCountTransformer implements Transformer<String, String, KeyValue<String, Long>> {

    private ProcessorContext context;
    private KeyValueStore<String, Long> stateStore;

    @Override
    @SuppressWarnings("unchecked")
    public void init(ProcessorContext context) {
        this.context = context;
        // Retrieve the state store
        this.stateStore = (KeyValueStore<String, Long>) context.getStateStore("word-count-store");
    }

    @Override
    public KeyValue<String, Long> transform(String key, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }

        // Split the value into words
        String[] words = value.toLowerCase().split("\\W+");
        KeyValue<String, Long> result = null;

        for (String word : words) {
            // Update the word count in the state store
            Long currentCount = stateStore.get(word);
            if (currentCount == null) {
                currentCount = 0L;
            }
            currentCount++;
            stateStore.put(word, currentCount);

            // Forward the updated word count
            result = new KeyValue<>(word, currentCount);
            context.forward(word, currentCount);
        }

        return result;
    }

    @Override
    public void close() {
        // Cleanup resources if necessary
    }
}