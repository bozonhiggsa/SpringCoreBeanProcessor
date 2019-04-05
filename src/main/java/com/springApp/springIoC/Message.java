package com.springApp.springIoC;

import org.springframework.beans.factory.annotation.Required;

/**
 * Bean class
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Message {

    private String message;

    public Message() {
        System.out.println("This is first phase of Bean's Constructor. Message is: " + message);
    }

    public String getMessage() {
        return message;
    }

    @Required
    public void setMessage(String message) {
        this.message = message;
        System.out.println("Setter for Message is performed. Message is: " + this.message);
    }

    public void init() {
        System.out.println("Bean is in an init phase");
        setMessage("This is third message");
    }

    public void destroy() {
        System.out.println("Bean will be destroyed now");
    }
}
