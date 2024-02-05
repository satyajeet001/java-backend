package com.midas.app.activities;

import com.midas.app.providers.payment.CreateAccount;
import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface AccountActivity {

    @ActivityMethod
    CreateAccount saveAccount(CreateAccount details);
}
