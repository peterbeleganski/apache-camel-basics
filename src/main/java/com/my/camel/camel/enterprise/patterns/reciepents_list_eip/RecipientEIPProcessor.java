package com.my.camel.camel.enterprise.patterns.reciepents_list_eip;

import org.apache.camel.Exchange;

public class RecipientEIPProcessor implements org.apache.camel.Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String employeeType =
                exchange.getIn().getHeader("type", String.class);
        if (employeeType.equals("senior")) {
            exchange.getIn().setHeader("type", "file:xmlsenior");
        } else {
            exchange.getIn().setHeader("type", "file:xmljunior");

        }
    }
}
