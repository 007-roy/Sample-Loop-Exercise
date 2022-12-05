package com.file.Example;
import java.util.Scanner;

public class loop12 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int number;
        char choice;

        do {

            for(int i = 0; i < 5; i++){

                System.out.println("Input your numbers : \n ");
                number = scn.nextInt();

                if (number > max){
                    max = number;
                } else if (number < min) {
                    min = number;
                }

            }

            System.out.println("Do you want to continue? \n Y/N");
            choice = scn.next().charAt(0);
        }while (choice == 'Y' || choice == 'y');

        System.out.println("The largest number is : " + max);
        System.out.println("The smallest number is : " + min);

    }

}