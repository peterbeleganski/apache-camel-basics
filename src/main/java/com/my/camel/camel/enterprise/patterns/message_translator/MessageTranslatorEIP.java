package com.my.camel.camel.enterprise.patterns.message_translator;

import org.apache.camel.builder.RouteBuilder;

public class MessageTranslatorEIP extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:input?fileName=text.txt&noop=true")
            .process(new MessageProcessor())
            .to("file:input?fileName=text.csv");
    }
}
