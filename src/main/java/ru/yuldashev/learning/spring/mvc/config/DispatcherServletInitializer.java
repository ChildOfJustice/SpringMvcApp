package ru.yuldashev.learning.spring.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};  // returns the spring configuration class to run the spring app context
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"}; // all requests will be sent to the "/" path for the default dispatcher servlet
    }
}
