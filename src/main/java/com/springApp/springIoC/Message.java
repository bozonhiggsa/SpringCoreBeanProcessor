package com.springApp.springIoC;

import org.springframework.beans.factory.annotation.Required;

/**
 * Model
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Message {
    private String message;

    public Message() {
        System.out.println("Constructor of Message is performed");
    }

    public String getMessage() {
        return "Message: " + message;
    }

    @Required
    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Bean is in an init phase");
    }

    public void destroy() {
        System.out.println("Bean will be destroyed now");
    }
}
