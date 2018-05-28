package camel.enterprice.patterns.wiretap;

import com.my.camel.camel.enterprise.patterns.wiretap.WireTapRoute;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.io.File;

import static com.my.camel.util.Values.initialMilliSeconds;

/*
*   WireTap Enterprise Integration Pattern
*
*   We use it when we want to view sensitive data but we use external debug file with our data in order
*   not to pollute or harm the output result in the output folder
*
* */

public class WireTapRouteTest extends CamelTestSupport {

    @Override
    public RouteBuilder createRouteBuilder(){

        return new WireTapRoute();
    }

    @Test
    public void wireTapRoute() throws InterruptedException {

        Thread.sleep(initialMilliSeconds);

        File file = new File("all");
        assertTrue(file.isDirectory());

        File fileDebug = new File("debug");
        assertTrue(fileDebug.isDirectory());
    }
}
