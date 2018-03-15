package com.sagarandcompany.ExceptionHandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@EnableAutoConfiguration
@SpringBootApplication
public class ExceptionHandlingApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ExceptionHandlingApplication.class, args);
        //DispatcherServlet dispatcherServlet = (DispatcherServlet) ctx.getBean("dispatcherServlet");
        //dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);

    }
}
