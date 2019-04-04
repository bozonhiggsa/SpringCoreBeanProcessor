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

        System.out.println("Context is created");
        Message message = (Message) context.getBean("message");
        System.out.println("\n==================================");
        System.out.println(message.getMessage());
        System.out.println("==================================\n");
        context.registerShutdownHook();
    }
}
