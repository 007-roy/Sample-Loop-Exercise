package com.file.Example;

import java.util.Random;
import java.util.Scanner;

public class loop17 {

    public static void main(String[] args){

        Random rand = new Random();

        int random_number = rand.nextInt(100);

        Scanner scn = new Scanner(System.in);
        System.out.print("   !!Guessing Game!!  ");
        System.out.println("\nGuess The Number???");
        int n = scn.nextInt();

        while (random_number != n){

            if (random_number > n){
                System.out.println("Too low,try again!");
                n = scn.nextInt();
            } else if (random_number < n) {
                System.out.println("Too high,try again!");
                n = scn.nextInt();
            }

        }
        System.out.println("Congratulations!!! You win !");
    }

}
