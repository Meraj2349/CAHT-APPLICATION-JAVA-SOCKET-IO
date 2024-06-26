package com.meraj.event;

import com.meraj.model.Model_Login;
import com.meraj.model.Model_Register;

public interface EventLogin {

    public void login(Model_Login data);

    public void register(Model_Register data, EventMessage message);

    public void goRegister();

    public void goLogin();
}
