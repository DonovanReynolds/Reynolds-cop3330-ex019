package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 19 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        double weight = stringToDouble("Please enter your weight in pounds");
        double height = stringToDouble("Please enter your height in inches");

        double bmi = (weight/(height*height))*703;
        System.out.println("Your BMI is " + String.format("%.1f" , bmi));
        System.out.println(bmi>18.5 && bmi < 25 ? "You are within the ideal weight range." : "You are overweight. You should see your doctor.");
    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

    public static int stringToInt(String error)
    {
        int temp = 0;
        boolean check = false;
        while(!check)
        {
            String text = inputOutput(error);
            try
            {
                temp = Integer.parseInt(text);
                check = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("You entered a value that is not a number. Please try again.");
            }
        }
        return temp;
    }

    public static double stringToDouble (String error)
    {
        double temp = 0.0;
        boolean check = false;
        while(!check)
        {
             String text = inputOutput(error);
            try
            {
                temp = Double.parseDouble(text);
                check = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("You entered a value that is not a number. Please try again.");

            }
        }
        return temp;
    }

}
