package com.Switch;

import java.util.Scanner;

/**
 * Created by icyhot on 20/05/2017.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String input = sc.nextLine();

        switch (input) {
            case "Jan":
                System.out.println("The month is 1");
                break;
            case "Feb":
                System.out.println("The month is 2");
//                break;
            case "Mar":
                System.out.println("The month is 3");
                break;
            default:
                System.out.println("You chose another month!");
        }
    }
}
