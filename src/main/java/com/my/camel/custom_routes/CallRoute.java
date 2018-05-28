package com.my.camel.custom_routes;

import com.my.camel.error_handling.CopyFilesRouteWithException;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class CallRoute {
    public static void main(String[] args) throws Exception {

        CamelContext context = new DefaultCamelContext();
        CopyFilesRouteWithException route = new CopyFilesRouteWithException();

        context.addRoutes(route);
        context.start();
        Thread.sleep(2000);
        context.stop();
    }
}
