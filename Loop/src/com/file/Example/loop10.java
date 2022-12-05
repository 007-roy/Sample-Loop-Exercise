package com.file.Example;

import java.util.Scanner;

public class loop10 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        char choice;
        int x,y,z;

        do {
            System.out.println("Enter the Numbers: ");

            x = scn.nextInt();
            y = scn.nextInt();
            z = x + y;

            System.out.println("The Sum of those Number is: " + z);

            System.out.println("\n Do you want to continue? ");

            choice = scn.next().charAt(0);

        }while(choice == 'Y' || choice == 'y');

    }

}