package com.chuan.servlet.web;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoServletTest implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) {
        System.out.println("ServletDemo1 is initializing...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("Hello, Servlet!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("ServletDemo1 is destroying...");
    }
}
