package com.file.Example;
import java.util.Scanner;


public class loop06 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();
        int reverse = 0;

        int temp = number;
        int remainder = 0;

        while(temp > 0){
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("The reverse of the "+ number + " is: " +reverse);

    }

}
