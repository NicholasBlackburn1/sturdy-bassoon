/*
 * Copyright Nicholas Blackburn (c) 2018.
 */

package com.nicholasblackburn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hextotex {
    public static void main (String[] args) throws IOException {
        System.out.print("convert hex to text");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String hex =bf.readLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < hex.length(); i+=2) {
            String str = hex.substring(i, i+2);
            output.append((char)Integer.parseInt(str, 16));
        }
        System.out.println(output);
        Main.main(args);
    }
    }

