package kingsley.app;

/**
 * 
 * @author kosime
 * 
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("greeting")
public class HelloResource {
	
	@GET	
	@Produces("text/html")
	public String sayHello(@QueryParam("name") String name) {
		
		return "Hello" + " " + name;
	}

}
