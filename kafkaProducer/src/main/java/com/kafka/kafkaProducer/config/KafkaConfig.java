//package com.kafka.kafkaProducer.config;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@EnableKafka
//@Configuration
//public class KafkaConfig {
//
//    @Bean
//    public KafkaTemplate<String, Object> kafkaTemplate() {
//        return new KafkaTemplate<String, Object>(producerFactory());
//    }
//
//    @Bean
//    public ProducerFactory<String, Object> producerFactory() {
//        Map<String, Object> kafkaConfig = new HashMap<>();
//        kafkaConfig.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"); //서버 정보
//        kafkaConfig.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class); //key 직렬화 정보
//        kafkaConfig.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class); //value 직렬화 정보
//
//        return new DefaultKafkaProducerFactory<>(kafkaConfig);
//    }
//
//    @Bean
//    public ConsumerFactory<String, Object> consumerFactory() {
//        Map<String, Object> kafkaConfig = new HashMap<>();
//        kafkaConfig.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"); //서버 정보
//        kafkaConfig.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class); //key 역직렬화 정보
//        kafkaConfig.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class); //value 역직렬화 정보
//
//        return new DefaultKafkaConsumerFactory<>(kafkaConfig);
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, Object> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, Object> kafkaFactory = new ConcurrentKafkaListenerContainerFactory<>();
//        kafkaFactory.setConsumerFactory(consumerFactory());
//        return kafkaFactory;
//    }
//
//}
