/*
 * Copyright Nicholas Blackburn(c) 2018.
 */

package com.nicholasblackburn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class texttohex {
    public static void main(String[] args) throws IOException {
        System.out.print("enter text\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();


        // Step-1 - Convert ASCII string to char array
        char[] ch = s.toCharArray();

        // Step-2 Iterate over char array and cast each element to Integer.
        StringBuilder builder = new StringBuilder();

        for (char c : ch) {
            int i = (int) c;
            // Step-3 Convert integer value to hex using toHexString() method.
            builder.append(Integer.toHexString(i).toUpperCase());
        }

        System.out.println("ASCII = " + s);
        System.out.println("Hex = " + builder.toString());
        Main.main(args);
    }
}

