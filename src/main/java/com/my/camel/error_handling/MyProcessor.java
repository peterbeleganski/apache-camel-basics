package com.my.camel.error_handling;

import org.apache.camel.Exchange;

public class MyProcessor implements org.apache.camel.Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        // Throws Exception
    }
}
