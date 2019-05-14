package com.stackroute.spring;

import com.stackroute.spring.bean.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Movie movieA = (Movie) context.getBean("MovieA");
        Movie movieB = (Movie) context.getBean("MovieA");
        System.out.println(movieA==movieB);


    }
}
