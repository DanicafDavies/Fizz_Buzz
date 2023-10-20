package org.example;
/**
 * File_Name: Fizz_Buzz
 * Coding Language: Java
 * Author: Danica Davies
 * Date of creation: 20/10/23
 * Date of last update: 20/10/23
 * Description: Basic coding solution for coding problem Fizz_Buzz.
 * Fizz printed for multiples of three, Buzz for multiples of five,
 * Fizz Buzz for both, Inputted number for non multiples of either. **/
public class Fizz_Buzz
{

    public static void main( String[] args )
    {
        int i = 0;
        int Max_V = 300;
        while (i <= Max_V)
        {
            System.out.println(FizzBuzz_If(i, Max_V));
            i++;

        }
    }

    public static String FizzBuzz_If(int i, int Max_V)
    {
        if (i % 3 == 0 && i % 5 != 0)
        {
            return "Fizz";
        }
        else if (i % 5 == 0 && i % 3 != 0)
        {
            return "Buzz";
        }
        else if (i % 5 == 0 && i % 3 == 0)
        {
            return "FizzBuzz";
        }
        else
            return String.valueOf(i);
    }
}