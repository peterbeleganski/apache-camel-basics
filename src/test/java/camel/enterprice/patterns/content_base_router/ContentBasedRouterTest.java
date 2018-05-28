package camel.enterprice.patterns.content_base_router;

import com.my.camel.camel.enterprise.patterns.content_base_router.ContentBasedRouterRoute;
import com.my.camel.util.Values;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.io.File;

public class ContentBasedRouterTest extends CamelTestSupport {

    @Override
    public RouteBuilder createRouteBuilder(){

        return new ContentBasedRouterRoute();
    }

    @Test
    public void contentBasedRouterTest() throws InterruptedException {

        Thread.sleep(Values.initialMilliSeconds);
        File file = new File("html");
        assertTrue(file.isDirectory());

        File file2 = new File("text");
        assertTrue(file2.isDirectory());

        File file3 = new File("json");
        assertTrue(file3.isDirectory());
    }
}
