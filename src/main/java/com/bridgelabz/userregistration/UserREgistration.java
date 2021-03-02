package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserREgistration {
    private static String firstName = "^[A-Z]{1}[a-z]{2,14}$";
    private static String lastName = "^[A-Z]{1}[a-z]{2,14}$";


    public boolean checkFirstName(String name){
        Pattern p = Pattern.compile(name);
        return Pattern.matches(firstName, name);
    }
    public boolean checkLastName(String name){
        Pattern p = Pattern.compile(name);
        return Pattern.matches(lastName, name);
    }
}
