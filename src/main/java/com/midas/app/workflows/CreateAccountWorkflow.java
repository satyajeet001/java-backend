package com.midas.app.workflows;

import com.midas.app.providers.payment.CreateAccount;
import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface CreateAccountWorkflow {

    @WorkflowMethod
    CreateAccount createAccount(CreateAccount details);
}
