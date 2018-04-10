package com.my.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CopyFilesCamel {
    public static void main(String[] args) {
        CamelContext context = new DefaultCamelContext();

        try {
            context.addRoutes(new RouteBuilder() {
                @Override
                public void configure() {
                    from("file:data/input?noop=true")
                        .to("file:data/output");
                }
            });

            context.start();
            Thread.sleep(2000);
            context.stop();

        } catch (Exception e) {
            System.out.println("Exception is: " + e.getMessage());
            e.printStackTrace();
        }
    }
}