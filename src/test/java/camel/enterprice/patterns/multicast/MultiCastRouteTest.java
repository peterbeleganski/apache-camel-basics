package camel.enterprice.patterns.multicast;

import com.my.camel.camel.enterprise.patterns.multicast.MultiCastRoute;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.io.File;

import static com.my.camel.util.Values.initialMilliSeconds;

public class MultiCastRouteTest extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new MultiCastRoute();
    }


    @Test
    public void multicastRouteTest() throws InterruptedException {

        Thread.sleep(initialMilliSeconds);
        File file = new File("output1");
        assertTrue(file.isDirectory());

    }
}
