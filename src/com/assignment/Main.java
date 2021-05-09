package com.assignment;

public class Main {

    public static void main(String[] args) {
        //variable "someText" have not been initialized
        String someText;
        System.out.println(someText);

        //this is a syntax error
        int num = 5
        System.out.println(num);

        //"class" is a reserved word which will result an error
        String class = "Math";
        System.out.println(class);

        //this block of code will create an infinite loop
        for ( ; ; ) {
            System.out.println("Never ending loop...");
        }

        //the variable "number" is out of scope
        if (true) {
            int number = 5;
        }
        System.out.println(number);

        //duplicate local variable "num"
        if (true) {
            int num = 2;
            System.out.println(num);
        }
    }
}
