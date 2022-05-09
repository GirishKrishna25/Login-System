package com.company;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<String, String>();
    IDandPasswords() {
        loginInfo.put("girish", "girish@25");
        loginInfo.put("pooja", "pooja@25");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}
