package com.team.legendary.application;

import javax.servlet.Filter;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class SpringServletInitializer  extends AbstractDispatcherServletInitializer {

	public static final String CHARACTER_ENCODING = "UTF-8";

	public static AnnotationConfigWebApplicationContext context
		= new AnnotationConfigWebApplicationContext();

    public SpringServletInitializer() {
        super();
    }
    
	@Override
	protected WebApplicationContext createServletApplicationContext() {
		context.register(SpringWebConfig.class);
		return context;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		return null;
	}
	
	@Override
	protected Filter[] getServletFilters() {
	    final CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
	    encodingFilter.setEncoding(CHARACTER_ENCODING);
	    encodingFilter.setForceEncoding(true);
	    return new Filter[] { encodingFilter };
	}

}
