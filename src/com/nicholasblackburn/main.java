/*ed by NicholasBlackburn (c) 2018
Copyright
 */

package com.nicholasblackburn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main{
    public static void main(String[] args) throws IOException {

        int menu;

            int selection;
            Scanner input = new Scanner(System.in);

            /***************************************************/

            System.out.println("Nicks all in one text to hex to binary converter");
            System.out.println("-------------------------\n");
            System.out.println("1 - text to hex");
            System.out.println("2 - hex to binary");
            System.out.println("3 - guide");
            System.out.println("4 - hex to ascii");
            System.out.println("5 - Quit");
            System.out.println("-------------------------\n");
            selection = input.nextInt();
        if (selection == 1){
            texttohex.main(args);
        }
        if (selection == 2){
            hextobinary.main(args);
            }
            if(selection ==3){
            System.out.print("to make text to binary \n");
            System.out.print("first use text to hex and then use hex to binary");
            }
            if (selection == 4){
            hextotex.main(args);
            }
            if (selection == 5) {
                System.exit(0);
            }


        }
    }
