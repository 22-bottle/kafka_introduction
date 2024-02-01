//package com.kafka.kafkaProducer.service;
//
//import org.apache.kafka.common.serialization.Serde;
//import org.apache.kafka.common.serialization.Serdes;
//import org.apache.kafka.streams.StreamsBuilder;
//import org.apache.kafka.streams.kstream.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.Duration;
//
//@Service
//public class StreamService {
//
//    private static final Serde<String> STRING_SERDE = Serdes.String();
//
//    @Autowired
//    public void buildPipeline(StreamsBuilder sb) {
////        KStream<String, String> myStream = sb.stream("fastcampus", Consumed.with(STRING_SERDE, STRING_SERDE)); //key와 value를 넣음
////        myStream.print(Printed.toSysOut()); //console에 출력
////        myStream.filter((key, value) -> value.contains("freeClass")).to("freeClassList"); //value에 freeClass가 포함되면 freeClassList 토픽에 보냄
//
////        KStream<String, String> leftStream = sb.stream("leftTopic", Consumed.with(STRING_SERDE, STRING_SERDE))
//////                .selectKey((key, value) -> value); //value값을 키로 설정
////                .selectKey((key, value) -> value.substring(0, value.indexOf(":")));
////        KStream<String, String> rightStream = sb.stream("rightTopic", Consumed.with(STRING_SERDE, STRING_SERDE))
////                .selectKey((key, value) -> value.substring(0, value.indexOf(":")));
////        leftStream.print(Printed.toSysOut());
////        rightStream.print(Printed.toSysOut());
////
////        KStream<String, String> joinedStream = leftStream.join(rightStream,
////                (leftValue, rightValue) -> leftValue + "_" + rightValue, //join의 행위 (Joiner 객체를 만들어도 됨)
////                JoinWindows.ofTimeDifferenceAndGrace(Duration.ofMinutes(1), Duration.ofMinutes(1))); //join을 위한 window 지속 시간
////        joinedStream.print(Printed.toSysOut()); //1:leftValue:1_rightValue 이런 형식으로 출력됨
////        joinedStream.to("joinedMsg"); //joinedMsg 토픽에 보냄
//
//        KStream<String, String> leftStream = sb.stream("leftTopic", Consumed.with(STRING_SERDE, STRING_SERDE));
//        KStream<String, String> rightStream = sb.stream("rightTopic", Consumed.with(STRING_SERDE, STRING_SERDE));
//
//        ValueJoiner<String, String, String> stringJoiner = (leftValue, rightValue) -> {
//            return "[StringJoiner]" + leftValue + "-" + rightValue;
//        };
//        ValueJoiner<String, String, String> stringOuterJoiner = (leftValue, rightValue) -> {
//            return "[StringOuterJoiner]" + leftValue + "<" + rightValue;
//        };
//        KStream<String, String> joinedStream = leftStream.join(rightStream,
//                stringJoiner, //Joiner 객체
//                JoinWindows.ofTimeDifferenceAndGrace(Duration.ofMinutes(1), Duration.ofMinutes(1))); //join을 위한 window 지속 시간
//        KStream<String, String> outerJoinedStream = leftStream.outerJoin(rightStream,
//                stringOuterJoiner, //Joiner 객체
//                JoinWindows.ofTimeDifferenceAndGrace(Duration.ofMinutes(1), Duration.ofMinutes(1)));
//
//        joinedStream.print(Printed.toSysOut()); //1:leftValue:1_rightValue 이런 형식으로 출력됨
//        joinedStream.to("joinedMsg"); //joinedMsg 토픽에 보냄
//        outerJoinedStream.to("joinedMsg");
//    }
//
//}
