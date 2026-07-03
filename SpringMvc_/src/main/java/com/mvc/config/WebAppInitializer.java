package com.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Replaces web.xml.
 * Registers the Spring DispatcherServlet and wires up our Java-based configs.
 *
 * rootConfig    -> shared beans (DataSource, JdbcTemplate, Service, Repository)
 * servletConfig -> web layer beans (Controllers, ViewResolver)
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { DataSourceConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
