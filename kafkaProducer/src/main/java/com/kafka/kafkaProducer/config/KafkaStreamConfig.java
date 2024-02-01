package com.kafka.kafkaProducer.config;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.annotation.KafkaStreamsDefaultConfiguration;
import org.springframework.kafka.config.KafkaStreamsConfiguration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
@EnableKafkaStreams
public class KafkaStreamConfig {

    @Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME) //스마트라이프사이클(?)
    public KafkaStreamsConfiguration kafkaStreamsConfiguration() {
        Map<String, Object> kafkaStreamsConfig = new HashMap<>();
        kafkaStreamsConfig.put(StreamsConfig.APPLICATION_ID_CONFIG, "stream-test");
        kafkaStreamsConfig.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        kafkaStreamsConfig.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName()); //스트림은 받고 바로 보내기 때문에 serializer와 deserializer를 같이 선언함
        kafkaStreamsConfig.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        kafkaStreamsConfig.put(StreamsConfig.NUM_STREAM_THREADS_CONFIG, 3); //쓰레드 개수
        return new KafkaStreamsConfiguration(kafkaStreamsConfig);
    }

}
