package com.prosenjit.dsa.operators.bitwise;

/*
* this class will find if a specific number is even or odd.
* We are going to use bitwise operator for this. The idea is following:
* any number convert to binary i.e. base 2 (0,1) by compiler. now if we use bitwise & operator to check following
* number & 1 == 1 - if this is true then this is odd. as we know for bitwise operator and (&) if we check, it will
* result 1 only if the first binary number is 1
*  1 & 0 == 0
*  0 & 1 == 0
*  1 & 1 == 1
*  that means it will be 1 only if last binary is 1. BTW, last digit is call LSB (Last significant bit)
*  As we know other than the last place i.e. 0 place all other will
*  be even as per the power of base 2. for example
*    1 0 0 0 1
*    0 0 0 0 1  if we use bitwise & then it will result one only if LSB place is 1. then it will be odd or else
* even
 */

import java.util.Scanner;

public class OddOrEven {

    long num;

    public OddOrEven(long number) {
        this.num = number;
    }

    boolean findOddEven() {
        // using the bitwise operator to check if it's even or odd. if it returns true then odd or else even
        return (num & 1) == 1;
    }

    public static void main(String[] args) {
        // getting input from keyboard
        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        long numin = input.nextLong();

        OddOrEven obj = new OddOrEven(numin);
        // checking if the number is odd or even. if the findOddEven() method call is true then odd or else even
        System.out.println("The " + numin + " is a " + ((obj.findOddEven()) ? "Odd" : "Even") + " number..");

    }
}
