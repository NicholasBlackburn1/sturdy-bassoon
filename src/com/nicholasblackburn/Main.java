/*
 */

package com.nicholasblackburn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public int Main(String[] args) throws IOException {

        int menu;

            int selection;
            Scanner input = new Scanner(System.in);

            /***************************************************/

            System.out.println("Choose from these choices");
            System.out.println("-------------------------\n");
            System.out.println("1 - text to hex");
            System.out.println("2 - hex to binary");
            System.out.println("3 - help");
            System.out.println("4 - Quit");

            selection = input.nextInt();
        if (selection == 1){
            texttohex.main(args);
        }
        if (selection == 2){
            hextobinary.main(args);

         }
        return selection;


        }
    }


