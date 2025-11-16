/*

Assignment Instructions: https://coursera.cs.princeton.edu/algs4/assignments/hello/specification.php

Write a program HelloGoodbye.java that takes two names as command-line arguments and prints hello and goodbye messages as shown below 
(with the names for the hello message in the same order as the command-line arguments and with the names for the goodbye message in reverse order).


~/Desktop/hello> javac HelloGoodbye.java

~/Desktop/hello> java HelloGoodbye Kevin Bob
Hello Kevin and Bob.
Goodbye Bob and Kevin.

~/Desktop/hello> java HelloGoodbye Alejandra Bahati
Hello Alejandra and Bahati.
Goodbye Bahati and Alejandra.



*/

// Tutorial Resource: https://www.geeksforgeeks.org/java/command-line-arguments-in-java/


public class HelloGoodbye{
    public static void main (String[] args){
        String first_name = args[0];
        String last_name = args[1];

        System.out.println("Hello " + first_name + " and " + last_name + ".");
        System.out.println("Goodbye " + last_name + " and " + first_name + ".");
    }
}