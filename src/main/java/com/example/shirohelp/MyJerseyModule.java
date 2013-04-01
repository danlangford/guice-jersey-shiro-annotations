package com.example.shirohelp;

import java.util.HashMap;
import java.util.Map;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class MyJerseyModule extends JerseyServletModule {

	@Override
	protected void configureServlets() {
		Map<String,String> params = new HashMap<String, String>();		
		params.put(PackagesResourceConfig.PROPERTY_PACKAGES, "com.example.shirohelp");
		
		filter("/*").through(GuiceContainer.class, params);
	}

}
