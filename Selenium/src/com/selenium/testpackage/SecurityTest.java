package com.selenium.testpackage;

import com.selenium.utility.Security;

/**
 * Created by gaurnitai on 2017-09-18.
 */
public class SecurityTest {

    public static void main(String args[]){

        String uname = Security.encryt("rajeshwar96");
        System.out.println(uname);

        Security.decryt(uname);
        System.out.println(Security.decryt(uname));


    }

}
