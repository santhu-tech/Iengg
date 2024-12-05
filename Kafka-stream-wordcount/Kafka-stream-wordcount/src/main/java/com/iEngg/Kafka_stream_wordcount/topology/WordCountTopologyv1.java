package com.iEngg.Kafka_stream_wordcount.topology;

import com.iEngg.Kafka_stream_wordcount.Processor.WordCountProcessor;
import com.iEngg.Kafka_stream_wordcount.Processor.WordCountSupplier;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.processor.ProcessorSupplier;
import org.apache.kafka.streams.state.KeyValueStore;
import org.apache.kafka.streams.state.StoreBuilder;
import org.apache.kafka.streams.state.Stores;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class WordCountTopologyv1 {
    public Topology createTopology() {

        Topology topology=new Topology();
        topology.addSource("Source","word-count-input")
                .addProcessor("processor", new WordCountSupplier(),"source")
                .addStateStore(wordCountStore,"processor")
                .addSink("sink","word-count-output","processor");
                return  topology;

    }
    //    StreamsBuilder builder = new StreamsBuilder();

        // Create the state store for word count
        StoreBuilder<KeyValueStore<String, Long>> wordCountStore = Stores.keyValueStoreBuilder(
                Stores.persistentKeyValueStore("word-count-store"),
                Serdes.String(),
                Serdes.Long()
        );


}
