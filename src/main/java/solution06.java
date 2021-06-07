/*
 * UCF COP3330 Summer 2021 Assignment 5 Solution
 * Copyright 2021 Alexander De Corte
 */

import java.util.Scanner;
import java.util.Calendar;

public class solution06 {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int curAge, retAge, timeLeft;
        Scanner in = new Scanner(System.in);

        System.out.print("What is your current age? ");
        curAge = Integer.parseInt(in.nextLine());

        System.out.print("At what age would you like to retire? ");
        retAge = Integer.parseInt(in.nextLine());

        timeLeft = retAge - curAge;

        if(timeLeft > 0) {
            System.out.printf("you have %d years left until you can retire.\n", timeLeft);
            System.out.printf("It's %d, so you can retire in %d.\n", year, year + timeLeft);

        } else {
            System.out.println("You are ready to retire! Enjoy!!");
        }


    }
}
