package camel.enterprice.patterns.recipientListEIP;

import com.my.camel.camel.enterprise.patterns.reciepents_list_eip.RecipientListRoute;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.io.File;

import static com.my.camel.util.Values.initialMilliSeconds;

public class RecipientListRouteTest extends CamelTestSupport {

    @Override
    public RouteBuilder createRouteBuilder(){

        return new RecipientListRoute();
    }

    @Test
    public void recipientListTest() throws InterruptedException {

        Thread.sleep(initialMilliSeconds);

        File fileSenior = new File("xmlsenior");
        assertTrue(fileSenior.isDirectory());

        File fileJunior = new File("xmljunior");
        assertTrue(fileJunior.isDirectory());

    }
}
