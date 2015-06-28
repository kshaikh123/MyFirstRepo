package com.kk.cssdk.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * This class is used to give non-managed beans a way to access spring-managed beans
 *
 * Created by dlampkin on 4/16/15.
 */
@Component
public class AppContext implements ApplicationContextAware{

    private static ApplicationContext context;

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }
    public static ApplicationContext getApplicationContext() {
        return context;
    }
}
