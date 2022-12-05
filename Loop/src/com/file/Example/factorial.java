package com.file.Example;
import java.util.Scanner;


public class factorial {

    public static void main(String[] args){

        Scanner fac = new Scanner(System.in);

        int j = fac.nextInt();
        int fact = 1;

        for(int i = 1; i <= j; i++){
            fact = fact * i;
        }

        System.out.println(fact);
    }

}
