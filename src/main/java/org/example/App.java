/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //print statement asking for noun to be inputted
        System.out.println("Enter a noun: ");
        //string will be inputted and stored as "noun"
        String noun = scanner.nextLine();

        //print statement asking for verb to be inputted
        System.out.println("Enter a verb: ");
        //string will be inputted and stored as "verb"
        String verb = scanner.nextLine();

        //print statement asking for adjective to be inputted
        System.out.println("Enter an adjective: ");
        //string will be inputted and stored as "adjective"
        String adjective = scanner.nextLine();

        //print statement asking for adverb to be inputted
        System.out.println("Enter an adverb: ");
        //string will be inputted and stored as "adverb"
        String adverb = scanner.nextLine();

        //print input and response back
        System.out.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}