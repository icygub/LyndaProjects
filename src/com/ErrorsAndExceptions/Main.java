package com.ErrorsAndExceptions;

/**
 * Created by Guapito on 5/19/2017.
 */
public class Main {

    public static void main(String[] args) {
        String s = null;

        System.out.println(s);

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();
        char lastChar = chars[chars.length-1];
        System.out.println(lastChar);
    }
}
