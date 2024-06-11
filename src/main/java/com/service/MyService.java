package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.configuration.AppConfig;

@Service
public class MyService {
	
	 private final AppConfig appConfig;

	 
	    @Autowired
	    public MyService(AppConfig appConfig) {
	        this.appConfig = appConfig;
	    }
	    

	    public void printAppConfig() {
	        System.out.println("App Name: " + appConfig.getName());
	        System.out.println("App Version: " + appConfig.getVersion());
	        System.out.println("App Features: " + appConfig.getFeatures());
	    }

}
