package com.file.Example;
import java.util.Scanner;


public class loop09 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int dividend, divisor;
        int remainder;
        int hcf = 0;

        dividend = scn.nextInt();
        divisor = scn.nextInt();

        do {
            remainder = dividend % divisor;

            if (remainder == 0){
                 hcf = divisor;
            }else {
                dividend = divisor;
                divisor = remainder;
            }

        }while (remainder != 0);

        System.out.println("HCF = " + hcf);

    }

}
