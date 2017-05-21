package com.TryCatch;

/**
 * Created by icyhot on 20/05/2017.
 */
public class TryCatch {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            char lastChar = chars[chars.length];
            System.out.println(lastChar);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
