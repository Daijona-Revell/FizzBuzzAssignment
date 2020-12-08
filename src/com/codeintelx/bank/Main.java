package com.codeintelx.bank;

import java.util.Scanner;

public class Main
{
    static boolean quit = false;

    public static void main(String[] args)
    {

        while(!quit)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input a number. To close out of the system, please input -1.");
            int numberFromUser = scanner.nextInt();
            FizzBuzzImplementation(numberFromUser);
        }

    }

    public static void FizzBuzzImplementation(int numberFromUser)
    {

            if ((numberFromUser % 5 == 0) && (numberFromUser % 3 == 0))
                {
                System.out.println("FizzBuzz; Congratulations, this number is a multiple of 3 and 5");
                }
            else if (numberFromUser % 3 == 0)
                {
                System.out.println("Fizz; This number is a multiple of 3");
                }
            else if (numberFromUser % 5 == 0)
                {
                System.out.println("Buzz; This number is a multiple of 5");
                }
            else if (numberFromUser == -1)
                {
                    System.out.println("Closing out of System, Thank you for using");
                    quit =true;
                }
            else
                {
                System.out.println("Invalid Input, Please try again");
                }
        }
}
