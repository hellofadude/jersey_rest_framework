package kingsley.app;

import static org.junit.Assert.assertEquals;

import java.net.URI;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import kingsley.app.App;

public class HelloResourceTest extends JerseyTest {
	
	@Override
    protected Application configure() {
        return new App();
    }

    @Override
    protected URI getBaseUri() {
        return UriBuilder.fromUri(super.getBaseUri()).path("/").build();
    }

    @Test
    public void testGreeting() {
    	String s = target().path(App.ROOT_PATH).queryParam("name", "Kingsley").request(MediaType.TEXT_HTML).get(String.class);
    	assertEquals("Hello Kingsley", s);    	
    }

}
