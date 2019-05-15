package com.stackroute.spring.bean;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor {

    public java.lang.Object postProcessBeforeInitialization(java.lang.Object bean, java.lang.String beanName) throws org.springframework.beans.BeansException {
            System.out.println("In post processorBefore Initialisation of :"+beanName);
            return bean;
        }


        public java.lang.Object postProcessAfterInitialization(java.lang.Object bean, java.lang.String beanName) throws org.springframework.beans.BeansException {
            System.out.println("In post Aftetr Initialisation :"+beanName);
            return bean;

        }


    }

