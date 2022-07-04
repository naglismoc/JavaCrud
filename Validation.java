package com.company;

import java.util.Scanner;

public class Validation {

    private Validation() {}

    public static int getOption(Scanner sc) {
        int opt = 0;
        while (true) {
            try {
                opt = sc.nextInt();
                break;
            } catch (Exception e) {}
        }

        sc.nextLine();
        return opt;
    }

    public static boolean isNameValid(String name) {
        if (name.charAt(0) == name.toLowerCase().charAt(0)) {
            System.out.println("kodėl vardas ne iš didžiosios raidės?");
            return false;
        }
        return true;
    }

    public static boolean isSurnameValid(String name) {

        return true;
    }

    public static boolean isAgeValid(int name) {

        return true;
    }

    public static boolean isPhoneNoValid(String name) {

        return true;
    }

    public static boolean isEmailValid(String name) {

        return true;
    }
}