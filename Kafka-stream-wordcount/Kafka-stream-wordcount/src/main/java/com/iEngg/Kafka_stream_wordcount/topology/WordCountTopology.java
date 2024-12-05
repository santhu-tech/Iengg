package com.example.wordcount.topology;

import com.example.wordcount.transformer.WordCountTransformer;
import com.iEngg.Kafka_stream_wordcount.Processor.WordCountTransformer;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.state.KeyValueStore;
import org.apache.kafka.streams.state.StoreBuilder;
import org.apache.kafka.streams.state.Stores;
import org.springframework.stereotype.Component;

@Component
public class WordCountTopology {

    private final String inputTopic = "input-topic";
    private final String outputTopic = "output-topic";

    public Topology createTopology() {
        StreamsBuilder builder = new StreamsBuilder();

        // Create a state store for word counts
        StoreBuilder<KeyValueStore<String, Long>> wordCountStore = Stores.keyValueStoreBuilder(
                Stores.persistentKeyValueStore("word-count-store"),
                Serdes.String(),
                Serdes.Long()
        );

        // Add the state store to the topology
        builder.addStateStore(wordCountStore);

        // Define the topology with the transformer
        builder.stream(inputTopic)
                .transform(() -> new WordCountTransformer(), "word-count-store")
                .to(outputTopic);

        return builder.build();
    }
}
