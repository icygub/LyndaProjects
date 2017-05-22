package com.ComplexCalc;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by icyhot on 21/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numeric value: ");
        String str1 = sc.next();

        System.out.print("Enter a numeric value: ");
        String str2 = sc.next();

        try {
            double doub1 = Double.parseDouble(str1);
            double doub2 = Double.parseDouble(str2);
        } catch (Exception e) {
            System.out.println("Number formatting ");
        }

    }
}
