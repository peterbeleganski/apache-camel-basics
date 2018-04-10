package com.my.camel;

import com.my.camel.custom_routes.CopyFilesRoute;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class CopyFilesRouteTest  extends CamelTestSupport{

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new CopyFilesRoute();
    }

    @Test
    public void checkIfFileExistsInOutputDirectory() {

    }

}
