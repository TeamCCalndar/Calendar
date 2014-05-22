package com.rodionbykov.calendar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rodion Bykov on 22.05.2014.
 */
public class Main {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rodionbykov/calendar/applicationContext.xml");
    }

}
