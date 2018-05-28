package com.my.camel.error_handling;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

public class HandlingRoutesExeptions extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        onException(Exception.class)
                .to("log:GeneralError?level=ERROR");

        from("direct:start")
                .doTry()
                    .process(new MyProcessor())
                .doCatch(Exception.class)
                    .to("direct:checkCredentials")
                .doFinally()
                    .to("direct:end");

        onException(Exception.class)
                .handled(true)
                .process(new MyProcessor() {
                    public void process(Exchange exchange) throws Exception {
                        Exception exception = (Exception) exchange.getProperty(Exchange.EXCEPTION_CAUGHT);
                        //log, email, reroute, etc.
                    }
                });

    }
}
