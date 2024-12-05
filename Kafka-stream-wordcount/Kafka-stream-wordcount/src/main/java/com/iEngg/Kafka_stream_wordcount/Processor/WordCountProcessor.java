package com.iEngg.Kafka_stream_wordcount.Processor;

import org.apache.kafka.streams.processor.api.Processor;
import org.apache.kafka.streams.processor.api.ProcessorContext;
import org.apache.kafka.streams.processor.api.Record;
import org.apache.kafka.streams.state.KeyValueStore;

public class WordCountProcessor implements Processor<String,String,String,String> {


    private ProcessorContext<String, String> context;
    private KeyValueStore<String, Long> stateStore;

    @Override
    public void init(ProcessorContext<String, String> context) {
        this.context = context;
        this.stateStore = context.getStateStore("word-count-store");
    }

    @Override
    public void process(Record<String, String> record) {
        if (record.value() == null || record.value().isEmpty()) {
            return;
        }

        //Spilt the input into words
        String value = record.value();
        String[] words = value.toLowerCase().split("\\w+");
        for (String word : words) {
            // Update word count in the state store
            Long currentCount = stateStore.get(word);
            if (currentCount == null) {
                currentCount = 0L;
            }
            Long updatedCount = currentCount++;
            stateStore.put(word, updatedCount);

            // Forward the updated word count to downstream
            context.forward(new Record<>(word, updatedCount.toString(), record.timestamp()));
        }
    }


    @Override
    public void close() {
        // Cleanup resources if needed
    }
}

