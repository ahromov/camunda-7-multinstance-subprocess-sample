package com.example.workflow.components.tasks;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestServiceTask implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) {
        final CreditLoaner creditLoaner = (CreditLoaner) delegateExecution.getVariable("creditLoaner");
        log.info("Notify corporate that person {} wants to get credit", creditLoaner.getFirstName());

        delegateExecution.setVariable("creditLoanerFirstName", creditLoaner.getFirstName());
        log.info("This is the user: {}", creditLoaner);
    }
}
