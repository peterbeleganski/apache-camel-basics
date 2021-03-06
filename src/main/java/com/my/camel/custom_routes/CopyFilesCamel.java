package com.my.camel.custom_routes;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

import static com.my.camel.util.Values.initialMilliSeconds;

public class CopyFilesCamel {
    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();

        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() {
                from("file:data/input?noop=true")
                        .to("file:data/output");
            }
        });

        context.start();
        Thread.sleep(initialMilliSeconds);
        context.stop();

    }
}
