package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);
        System.out.print( "What is the quote? ");
        String quote = Obj.nextLine();
        System.out.print( "Who said it? ");
        String person = Obj.nextLine();
        System.out.print(person+" says, \""+quote+"\"");
    }
}
