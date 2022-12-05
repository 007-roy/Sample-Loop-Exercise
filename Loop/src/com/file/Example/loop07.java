package com.file.Example;

import java.util.Scanner;

public class loop07 {
    
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        char choice;
        int odd = 0;
        int even = 0;

        do {
            System.out.print("Enter the number: ");
            int number = scn.nextInt();

            if(number % 2 == 0){
                even += number;
            } else {
                odd += number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = scn.next().charAt(0);

        }while (choice == 'Y' || choice == 'y');

        System.out.println("The sum of even number is: " + even);
        System.out.println("The sum of odd number is: " + odd);

    }
    
}