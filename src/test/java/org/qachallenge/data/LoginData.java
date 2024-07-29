package org.qachallenge.data;

import org.testng.annotations.DataProvider;

public class LoginData {

    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][] {
                { "testuser", "password" }
        };
    }

    @DataProvider(name = "loginErrorData")
    public Object[][] provideLoginErrorData() {
        return new Object[][] {
                { "", "password" },
                { "testuser", "" },
                { "", "" },
                { "testuser1", "password" },
                { "testuser", "password2" },
                { "", "password" },
                { "testuser", "" }
        };
    }


}
