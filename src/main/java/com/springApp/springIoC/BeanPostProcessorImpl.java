package com.springApp.springIoC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor implementation
 * @author Ihor Savchenko
 * @version 1.0
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean.getClass() == Message.class){
            System.out.println("==================================");
            System.out.println("This is second phase of Bean's Constructor:");
            System.out.println("postProcessBeforeInitialization method called for: " + beanName);
            ((Message) bean).setMessage("This is second message");
            System.out.println("==================================");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean.getClass() == Message.class){
            System.out.println("==================================");
            System.out.println("postProcessAfterInitialization method called for: " + beanName);
            ((Message) bean).setMessage("This is fourth message");
            System.out.println("==================================");
        }
        return bean;
    }
}
