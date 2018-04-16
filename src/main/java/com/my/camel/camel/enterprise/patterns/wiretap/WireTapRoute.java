package com.my.camel.camel.enterprise.patterns.wiretap;

import org.apache.camel.builder.RouteBuilder;

/*
 *   WireTap Enterprise Integration Pattern
 *
 *   We use it when we want to view sensitive data but we use external debug file with our data in order
 *   not to pollute or harm the output result in the output folder
 *
 * */

public class WireTapRoute  extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("file:input?noop=true")
                .wireTap("file:debug")
                .to("file:all");
    }
}
