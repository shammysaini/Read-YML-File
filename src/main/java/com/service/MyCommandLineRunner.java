package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	private final MyService myService;

    @Autowired
    public MyCommandLineRunner(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run(String... args) throws Exception {
        myService.printAppConfig();
    }

}
