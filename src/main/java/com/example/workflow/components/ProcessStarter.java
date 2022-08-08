package com.example.workflow.components;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProcessStarter implements CommandLineRunner {

    @Autowired
    private RuntimeService runtimeService;

    @Override
    public void run(String... args) {
        runtimeService.startProcessInstanceByKey("test-process");
    }
}
