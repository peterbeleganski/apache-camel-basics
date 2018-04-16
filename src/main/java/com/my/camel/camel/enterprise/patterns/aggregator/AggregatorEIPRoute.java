package com.my.camel.camel.enterprise.patterns.aggregator;

import org.apache.camel.builder.RouteBuilder;

public class AggregatorEIPRoute extends RouteBuilder{

    public void configure() throws Exception {

        from("direct:input")
                .log("Body :  ${body}  correlation id :  ${header.myId}")
                .aggregate(header("id"), new CustomAggregatorStrategy()).completionSize(3)
                .log("Sending out ${body}")
                .to("mock:output");
    }
}
