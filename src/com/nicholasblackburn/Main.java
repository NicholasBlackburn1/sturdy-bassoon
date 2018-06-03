/*
 */

package com.nicholasblackburn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public int Main(String[] args) throws IOException {
        System.out.print("enter 1 for text to hex or enter 2 for hex to binary");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int menu;

            int selection;
            Scanner input = new Scanner(System.in);

            /***************************************************/

            System.out.println("Choose from these choices");
            System.out.println("-------------------------\n");
            System.out.println("1 - texttohex");
            System.out.println("2 - Encrypt a number");
            System.out.println("3 - Decrypt a number");
            System.out.println("4 - Quit");

            selection = input.nextInt();
            return selection;
        }
    }


