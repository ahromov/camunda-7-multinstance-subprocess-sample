package com.example.workflow.components.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class GenerateCreditLoanersTask implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        List<CreditLoaner> creditLoaners = Arrays.asList(
                new CreditLoaner("Sarah", "Cox"),
                new CreditLoaner("John", "Doe"),
                new CreditLoaner("Filip", "Trajkovski")
        );

        delegateExecution.setVariable("creditLoanerList", creditLoaners);
    }
}