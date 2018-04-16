package camel.enterprice.patterns.aggregator;

import com.my.camel.camel.enterprise.patterns.aggregator.AggregatorEIPRoute;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class AggregatorEIPRouteTest extends CamelTestSupport{

    @Override
    public RouteBuilder createRouteBuilder(){

        return new AggregatorEIPRoute();
    }

    @Test
    public void testAggregate() throws InterruptedException {

        MockEndpoint mock = getMockEndpoint("mock:output");
        mock.expectedBodiesReceived("123");


        template.sendBodyAndHeader("direct:input", "1", "id", 1);
        template.sendBodyAndHeader("direct:input", "2", "id", 1);
        template.sendBodyAndHeader("direct:input", "3", "id", 1);

        assertMockEndpointsSatisfied();

    }
}
