package com.example.shirohelp;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceFilter;
import com.google.inject.servlet.GuiceServletContextListener;

public class GuiceConfig {

	@WebFilter("/*")
	public static class Filter extends GuiceFilter {
	}

	@WebListener
	public static class CustomGuiceListener extends GuiceServletContextListener {

		@Override
		protected Injector getInjector() {

			return Guice.createInjector(
					new MyJerseyModule()
				);

		}

	}

}
