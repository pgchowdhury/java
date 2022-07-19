package com.prosenjit.dsa.generics;

/*
Geek for Geeks
Generic Class in java  is a feature. We write code once and use it for any data type including user defined data types.
Given an integer or a string as an input.Print the type of input and the given value as output.

Input:
The first line will contain an integer T (number of test cases). First line of each test case will contain one
integer c. Next line will contain a string if c is equal to 1 or will contain a integer if c is equal to 2.

Output:
Print the type of the given data and the given value in new line.

Constraints:
1 < = T < = 100
1 < = c < = 2
1<= Length of strings, integers<=103

Example:
Input:
2
1
gfg
2
5

Output:
String
gfg
Integer
5
 */

import java.util.Scanner;


class GenericClass<T> {

    //Add your code here. Make a private data variable, constructor which intialize
    // the data variable and a method showType().
    private T val;

    //Constructor
    GenericClass(T x) {
        this.val = x;
    }

    void showType(){
        if (val instanceof Integer) {
            System.out.println("Integer");
            System.out.println(this.val);
        } else {
            System.out.println("String");
            System.out.println(this.val);
        }
    }
}

public class GenericClassExample1 { // Driver main class for GenericClass
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -->0) {
            int n = sc.nextInt();
            if (n==1) {
                String s = sc.next();
                GenericClass<String> str = new GenericClass<String>(s);
                str.showType();
            } else {
                Integer p = sc.nextInt();
                GenericClass<Integer> integer = new GenericClass<Integer>(p);
                integer.showType();
            }
        }
    }

}
