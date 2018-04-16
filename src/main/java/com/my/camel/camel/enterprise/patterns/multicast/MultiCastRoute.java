package com.my.camel.camel.enterprise.patterns.multicast;

import org.apache.camel.builder.RouteBuilder;

/*
*   Multicast Enterprise Integration Pattern
*
*   This pattern allows to route the same message to  a number of endpoints and process them in a different way.
*   This pattern will not modify the request message [Splitter EIP will split the message into several pieces]
* */


public class MultiCastRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("file:input?noop=true").multicast().parallelProcessing()
                .to("file:output1", "file:output2");

    }
}
