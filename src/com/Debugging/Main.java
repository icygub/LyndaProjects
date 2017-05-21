package com.Debugging;

/**
 * Created by icyhot on 20/05/2017.
 */
public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
