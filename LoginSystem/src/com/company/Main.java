package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    IDandPasswords idandPasswords = new IDandPasswords();
        HashMap loginInfo = idandPasswords.getLoginInfo();
        LoginPage loginPage = new LoginPage(loginInfo);
    }
}
