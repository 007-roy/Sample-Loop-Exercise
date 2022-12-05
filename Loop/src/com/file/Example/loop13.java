package com.file.Example;


public class loop13 {

    public static void main(String[] args){

        int digit1;
        int d1 = 0;

        for(int number = 1;number < 1000;number++){

            int temp = number;
            digit1 = temp % 10;
            temp /= 10;

            d1 += digit1 * digit1 * digit1;

            if (d1 == number ) {

                System.out.println(number);

            }

        }

    }

}
