package com.springApp.springIoC;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MessageWithPostBeanProcessorRunner {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("post-processor-config.xml");

        System.out.println("==================================");
        System.out.println("Context is created");
        System.out.println("==================================");

        context.refresh();

        context.registerShutdownHook();
    }
}
