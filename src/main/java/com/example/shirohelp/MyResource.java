package com.example.shirohelp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class MyResource {

	@GET
	public String getTest() {
		return "Hello! this is a test";
	}

}
