package com.stackroute.spring;

import com.stackroute.spring.bean.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Movie movie= (Movie) context.getBean("Movie");
        System.out.println(movie);



    }
}
