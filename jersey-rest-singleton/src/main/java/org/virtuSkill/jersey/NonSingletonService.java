package org.virtuSkill.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/nonsingleton")
public class NonSingletonService {
	private int increment;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String callMe() {
		increment++;
		return increment + " - times the method is called";
	}
}
