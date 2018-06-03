
/*
 * Copyright (c) Nicholas Blackburn 2018
 *
 */

package com.nicholasblackburn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class hextobinary {
// starts program
    public static void main(String[] args) throws IOException {
        // creates reader
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       // prints out text
        System.out.print("Turn hex to binar\n ");
        String hex = bf.readLine();
        int i = Integer.parseInt(hex);               //hex to decimal
        String by = Integer.toBinaryString(i);       //decimal to binary
        System.out.println("This is Binary: " + by);
    }
        }




