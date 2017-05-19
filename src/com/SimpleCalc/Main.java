package com.SimpleCalc;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Guapito on 5/19/2017.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");

        System.out.print("Enter a numeric value: ");
        String first = sc.next();
        System.out.print("Enter a numeric value: ");
        String second = sc.next();

        double firstD = Double.parseDouble(first);
        double secondD = Double.parseDouble(second);
        double total = firstD + secondD;

        System.out.printf("The answer is %s", df.format(total));

        }
    }

