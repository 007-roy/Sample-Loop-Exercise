package com.file.Example;
import java.util.Scanner;


public class loop05 {

    public static void main(String[] args){

        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        int x = scn1.nextInt();
        int y = scn2.nextInt();
        int result = 1;

        for (int i = y; i > 0; i--){
            result *= x ;
        }

        System.out.println(result);

    }

}
