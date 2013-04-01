package com.example.shirohelp;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceFilter;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class GuiceConfig {

	@WebFilter("/*")
	public static class Filter extends GuiceFilter {
	}

	@WebListener
	public static class CustomGuiceListener extends GuiceServletContextListener {

		@Override
		protected Injector getInjector() {

			return Guice.createInjector(new ServletModule() {
				@Override
				public void configureServlets() {
					serve("/test").with(MyServlet.class);
				}
			});

		}

	}

}
