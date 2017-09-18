package com.selenium.utility;

import org.apache.commons.codec.binary.Base64;

import java.util.Scanner;


/**
 * Created by gaurnitai on 2017-09-18.
 */
public class Security {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        // lets encode the usename
        byte[] encode = Base64.encodeBase64(username.getBytes());

        System.out.println(new String(encode));

        // Lets decode the username
        byte[] decode = Base64.decodeBase64(encode);

        System.out.println(new String(decode));

        // Lets encode the password

        String password = sc.nextLine();

        byte[] encodepwd = Base64.encodeBase64(password.getBytes());

        System.out.println(new String(encodepwd));

        byte[] decodepwd = Base64.decodeBase64(encodepwd);

        //System.out.println(decodepwd);
        System.out.println(new String(decodepwd));


    }


}
