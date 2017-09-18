package com.selenium.testpackage;

import com.selenium.utility.Security;

import java.util.Scanner;

/**
 * Created by gaurnitai on 2017-09-18.
 */
public class SecurityTest {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String pwd = sc.nextLine();

        String uname = Security.encryt(name);
        System.out.println(uname);

        Security.decryt(uname);
        System.out.println(Security.decryt(uname));


        String password = Security.decryt(Security.encryt(pwd));
        System.out.println(password);


    }

}
