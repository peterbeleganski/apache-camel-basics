package com.my.camel.camel.enterprise.patterns.content_base_router;

import org.apache.camel.builder.RouteBuilder;

public class ContentBasedRouterRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("file:input?noop=true") //noop - Dont perform any operation after moving the content.
                .choice()
                .when(header("CamelFileNameConsumed").endsWith(".html"))
                    .to("file:html")
                .when(header("CamelFileNameConsumed").endsWith(".txt"))
                    .to("file:text")
                .when(header("CamelFileNameConsumed").endsWith(".json"))
                    .to("file:json")
                .otherwise()
                    .to("file:other")
                .end();

    }
}
