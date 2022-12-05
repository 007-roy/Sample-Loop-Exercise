package com.file.Example;
import java.util.Scanner;


public class loop08 {

    public static void main(String[] argfs){

        Scanner scn = new Scanner(System.in);
        int x =  scn.nextInt();
        int y = 0;
        int i ;

        for (i = 2; i <= 1000; i++){

            if ( i != x && x % i == 0){
                System.out.println( x + " is not a prime number." );
                break;
            } else if (i != x && x % i != 0) {
                System.out.println( x + " is a prime number." );
                break;
            }

        }


    }

}
