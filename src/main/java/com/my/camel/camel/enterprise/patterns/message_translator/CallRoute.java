package com.my.camel.camel.enterprise.patterns.message_translator;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

import static com.my.camel.util.Values.initialMilliSeconds;

public class CallRoute {

    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        MessageTranslatorEIP meip = new MessageTranslatorEIP();

        context.addRoutes(meip);
        context.start();
        Thread.sleep(initialMilliSeconds);
        context.stop();
    }
}
