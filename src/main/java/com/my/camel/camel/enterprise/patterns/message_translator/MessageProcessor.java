package com.my.camel.camel.enterprise.patterns.message_translator;

import org.apache.camel.Exchange;

public class MessageProcessor implements org.apache.camel.Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String body = exchange.getIn().getBody(String.class);
        if(body != null) {
            String[] attr = body.split(" ");
            String firstName = attr[0];
            String lastName = attr[1];
            String age = attr[2];
            String subject = attr[3];

            StringBuilder csv = new StringBuilder();
            csv.append(firstName);
            csv.append(",").append(lastName);
            csv.append(",").append(age);
            csv.append(",").append(subject);

            exchange.getIn().setBody(csv.toString());
        }
    }
}
