package com.file.Example;
import java.util.Scanner;


public class loop15 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Input your number : ");
        int n = scn.nextInt();

        double a = 0;
        double s = 1;


        for (double i = 1; i < n+1; i++){

           a += s * 1 /i;

           s *= -1;

           System.out.println(a);

        }

    }

}
