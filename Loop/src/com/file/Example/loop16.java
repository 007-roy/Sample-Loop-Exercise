package com.file.Example;
import java.util.Scanner;


public class loop16 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Input your number : ");
        int n = scn.nextInt();
        if (n < 0){
            return;
        }
        double s = 1;
        double loga = 0;
        double logb = 0;
        double log = 0;

        for (int i = 1; i < n+1; i++){

            if (i % 2 == 0){
                loga += s/i;
            } else if (i % 2 != 0) {
                logb += s/i;
            }

            log = logb - loga;

        }
        System.out.print("\nThe answer is: ");
        System.out.println(log);

    }

}