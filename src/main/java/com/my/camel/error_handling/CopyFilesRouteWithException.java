package com.my.camel.error_handling;
import org.apache.camel.builder.RouteBuilder;

public class CopyFilesRouteWithException extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        onException(Exception.class)
                .to("log:GeneralError?level=ERROR")
                .handled(true);

        from("file:all?noop=true")
                .process(exchange -> {
                    throw new Exception("Test");
                })
                .to("file:data/output");
    }
}
