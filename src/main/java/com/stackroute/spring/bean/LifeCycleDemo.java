package com.stackroute.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleDemo implements InitializingBean, DisposableBean {

    public void customInit(){
        System.out.println("Inside customInit");
    }
    public void afterPropertiesSet() throws Exception {
        System.out.println("In AfterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("In Destroy method");
    }
    public void customDestroy(){
        System.out.println("In Custom Destroy");
    }
}