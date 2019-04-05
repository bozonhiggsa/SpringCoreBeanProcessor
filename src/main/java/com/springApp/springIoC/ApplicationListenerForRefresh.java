package com.springApp.springIoC;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * ApplicationListener implementation
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ApplicationListenerForRefresh implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if(contextRefreshedEvent.getApplicationContext().containsBean("message")){
            Message message = (Message) contextRefreshedEvent.getApplicationContext().getBean("message");
            System.out.println("This is third phase of Bean's Constructor:");
            message.setMessage("This is five message");
        }
    }
}
